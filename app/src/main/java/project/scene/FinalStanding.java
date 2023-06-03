package project.scene;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FinalStanding {
    private Stage stage;
    private Map<String, Medals> countryMedals = new HashMap<>();
    private ListView<String> standingsListView;
    
    public FinalStanding(Stage stage){
        this.stage = stage;
    }

    public void show(){
        ImageView imageView = new ImageView("./image/bgFinalStandings.png");
        imageView.setPreserveRatio(false);
        imageView.setFitHeight(600);
        imageView.setFitWidth(400);
        Label lfinalStandings = new Label("Final Standings");
        lfinalStandings.setId("lFinalStandings");
        String[] st = { "Brunei Darussalam", "Cambodia (Host)",
                "East Timor", "Indonesian", "Laos", "Malaysia", "Myanmar",
                "Philippines", "Singapore", "Thailand", "Vietnam" };

        Label lSelectCountry = new Label("Select Country");
        ChoiceBox<String> choiceBox = new ChoiceBox<>(FXCollections.observableArrayList(st));
        Label lGold = new Label("Gold");
        TextField tfGold = new TextField();
        Label lSilver = new Label("Silver");
        TextField tfSilver = new TextField();
        Label lBronze = new Label("Bronze");
        TextField tfBronze = new TextField();

        Button addButton = new Button("Add Medals");
        addButton.setId("btnAddMedali-Clear");
        addButton.setOnAction(event -> {
            String selectedCountry = choiceBox.getValue();
            int goldMedals = Integer.parseInt(tfGold.getText());
            int silverMedals = Integer.parseInt(tfSilver.getText());
            int bronzeMedals = Integer.parseInt(tfBronze.getText());

            updateMedals(selectedCountry, goldMedals, silverMedals, bronzeMedals);

            // Tampilkan perbaruan klasemen
            updateStandings();
        });
        Button clear = new Button("Clear");
        clear.setId("btnAddMedali-Clear");
        clear.setOnAction(event -> {
            String selectedCountry = choiceBox.getValue();
            tfGold.setText("");
            tfSilver.setText("");
            tfBronze.setText("");
            updateMedalsClear(selectedCountry, 0, 0, 0);
            updateStandings();
            // standingsListView.setItems(FXCollections.observableArrayList(" "));
        });

        Button btnBackToMenu = new Button("Back to Menu");
        btnBackToMenu.getStyleClass().add("btnScene2");
        btnBackToMenu.setOnAction(c -> {
            MenuScene menuScene = new MenuScene(stage);
            menuScene.show();
        });

        standingsListView = new ListView<>();
        standingsListView.setPrefWidth(200);
        standingsListView.setId("s");

        HBox hBox = new HBox(new Label("Country : "), choiceBox);
        hBox.setId("country-medals");
        VBox vBoxGold = new VBox(new Label("Gold :"), tfGold);
        vBoxGold.setId("country-medals");
        VBox vBoxSilver = new VBox(new Label("Silver :"), tfSilver);
        vBoxSilver.setId("country-medals");
        VBox vBoxBronze = new VBox(new Label("Bronze :"), tfBronze);
        vBoxBronze.setId("country-medals");
        HBox hBoxMedals = new HBox(vBoxGold, vBoxSilver, vBoxBronze);
        hBoxMedals.setSpacing(10);

        HBox hBoxButton = new HBox(addButton, clear);
        hBoxButton.setAlignment(Pos.CENTER);
        hBoxButton.setSpacing(10);
        VBox vBox = new VBox(lfinalStandings, hBox, hBoxMedals, hBoxButton, standingsListView, btnBackToMenu);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10));
        vBox.setAlignment(Pos.CENTER);

        StackPane pane = new StackPane(imageView, vBox);

        Scene scene = new Scene(pane, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    private void updateMedals(String country, int gold, int silver, int bronze) {
        Medals medals = countryMedals.getOrDefault(country, new Medals());
        medals.addMedals(gold, silver, bronze);
        countryMedals.put(country, medals);
    }
    private void updateMedalsClear(String country, int gold, int silver, int bronze) {
        Medals medals = countryMedals.getOrDefault(country, new Medals());
        // medals.addMedals(0, 0, 0);
        countryMedals.remove(country, medals);
        // countryMedals.put(country, medals);
    }

    private void updateStandings() {
        List<Map.Entry<String, Medals>> sortedList = new ArrayList<>(countryMedals.entrySet()); // Urutkan negara berdasarkan medali yang didapatkan
        sortedList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        List<String> standings = new ArrayList<>(); // Tampilkan urutan klasemen
        int rank = 1;
        for (Map.Entry<String, Medals> entry : sortedList) {
            standings.add(rank + ". " + entry.getKey() + ": " + entry.getValue().toString());
            rank++;
        }
        standingsListView.setItems(FXCollections.observableArrayList(standings));
    }

    private static class Medals implements Comparable<Medals> {
        private int gold;
        private int silver;
        private int bronze;

        public void addMedals(int gold, int silver, int bronze) {
            this.gold += gold;
            this.silver += silver;
            this.bronze += bronze;
        }

        @Override
        public int compareTo(Medals other) {
            if (this.gold != other.gold) { // Bandingkan berdasarkan medali emas terlebih dahulu
                return Integer.compare(this.gold, other.gold);
            }

            if (this.silver != other.silver) { // Jika medali emas sama, bandingkan berdasarkan medali perak
                return Integer.compare(this.silver, other.silver);
            }

            return Integer.compare(this.bronze, other.bronze); // Jika medali perak sama, bandingkan berdasarkan medali perunggu
        }

        @Override
        public String toString() {
            return gold + " Emas, " + silver + " Perak, " + bronze + " Perunggu";
        }
    }
}
