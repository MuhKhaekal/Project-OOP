package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import project.datasource.CountryDataSource;
import project.datasource.SportDataSource;
import project.models.Country;
import project.models.SportsAndVenue;

public class App extends Application {
    private Stage stage;
    private Map<String, Medals> countryMedals = new HashMap<>();
    private ListView<String> standingsListView;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("SEA App : Final Standing");
        stage.setResizable(false);
        stage.setScene(showScene1());
        stage.show();
    }

    public Scene showScene1() {
        ImageView imageView = new ImageView("./image/bgScene1.png");
        imageView.setPreserveRatio(false);
        imageView.setFitHeight(600);
        imageView.setFitWidth(400);

        Button btnNext = new Button("NEXT");
        btnNext.setId("btnNext");
        btnNext.setOnAction(action -> {
            showScene2();
        });

        VBox vBox = new VBox(btnNext);
        vBox.setId("btnNextVBox");
        vBox.setAlignment(Pos.BOTTOM_CENTER);

        StackPane pane = new StackPane(imageView, vBox);

        Scene scene = new Scene(pane, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        return scene;
    }

    public Scene showScene2() {
        ImageView imageView = new ImageView("./image/bgScene2.png");
        imageView.setPreserveRatio(false);
        imageView.setFitHeight(600);
        imageView.setFitWidth(400);

        Label selectMenu = new Label("SELECT MENU");
        selectMenu.setId("lSelectMenu");

        Button btnParticipatingCountries = new Button("Patricipating Countries");
        btnParticipatingCountries.getStyleClass().add("btnScene2");
        btnParticipatingCountries.setOnAction(a -> {
            stage.setScene(partcipatingCountries());
        });

        Button btnSports = new Button("Sports & Venue");
        btnSports.getStyleClass().add("btnScene2");
        btnSports.setOnAction(c -> {
            stage.setScene(sportsScene());
        });

        Button btnCalendar = new Button("Calendar");
        btnCalendar.getStyleClass().add("btnScene2");

        Button btnFinalStandings = new Button("Final Standings");
        btnFinalStandings.getStyleClass().add("btnScene2");
        btnFinalStandings.setOnAction(c -> {
            stage.setScene(finalStandings());
        });

        Button btnDocumentation = new Button("Documentation");
        btnDocumentation.getStyleClass().add("btnScene2");

        VBox vBox = new VBox(selectMenu, btnParticipatingCountries, btnSports, btnCalendar, btnFinalStandings,
                btnDocumentation);
        vBox.setAlignment(Pos.BASELINE_CENTER);
        vBox.setId("vBoxScene1");
        vBox.setSpacing(15);

        StackPane pane = new StackPane(imageView, vBox);

        Scene scene2 = new Scene(pane, 400, 600);
        scene2.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        stage.setScene(scene2);
        return scene2;
    }

    public Scene partcipatingCountries() {
        ImageView imageView = new ImageView("./image/bgParticipatingCountries.png");
        imageView.setPreserveRatio(false);
        imageView.setFitHeight(600);
        imageView.setFitWidth(400);

        Label lParticipatingCountries = new Label("Participating Countries");
        lParticipatingCountries.setId("lParticipatingCountries");

        ObservableList<Country> country = FXCollections.observableArrayList();
        country.addAll(CountryDataSource.getCountryData());
        TableView<Country> tableView = new TableView<>();

        TableColumn<Country, String> column1 = new TableColumn<>("Countries");
        column1.getStyleClass().add("column");
        column1.setCellValueFactory(new PropertyValueFactory<>("name"));
        column1.setMaxWidth(133);
        column1.setMinWidth(133);

        TableColumn<Country, String> column2 = new TableColumn<>("Athletes");
        column2.setCellValueFactory(new PropertyValueFactory<>("atlet"));
        column2.getStyleClass().add("column");
        column2.setMaxWidth(133);
        column2.setMinWidth(133);

        TableColumn<Country, String> column3 = new TableColumn<>("Featured Sport");
        column3.setCellValueFactory(new PropertyValueFactory<>("sport"));
        column3.getStyleClass().add("column");
        column3.setMaxWidth(134);
        column3.setMinWidth(134);

        tableView.getColumns().addAll(column1, column2, column3);
        tableView.setItems(country);

        Button btnBackToMenu = new Button("Back to Menu");
        btnBackToMenu.getStyleClass().add("btnScene2");
        btnBackToMenu.setOnAction(b -> {
            stage.setScene(showScene2());
        });

        tableView.setFixedCellSize(33);
        tableView.getStyleClass().add("table-view");

        VBox vbox = new VBox(lParticipatingCountries, tableView);
        vbox.setId("vboxParticipatingCountries");
        vbox.setAlignment(Pos.TOP_CENTER);

        VBox vbox2 = new VBox(btnBackToMenu);
        vbox2.setId("vboxParticipatingCountries2");
        vbox2.setAlignment(Pos.BOTTOM_CENTER);

        StackPane pane = new StackPane(imageView, vbox, vbox2);
        Scene scene = new Scene(pane, 400, 600);

        scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        return scene;
    }

    public Scene sportsScene(){
        ObservableList<SportsAndVenue> sportsAndVenues = FXCollections.observableArrayList();
        sportsAndVenues.addAll(SportDataSource.getSportsAndVenuesData());
        TableView<SportsAndVenue> tableView = new TableView<>();

        TableColumn<SportsAndVenue, String> column1 = new TableColumn<>("City");
        column1.getStyleClass().add("column");
        column1.setCellValueFactory(new PropertyValueFactory<>("city"));
        column1.setMaxWidth(133);
        column1.setMinWidth(133);

        TableColumn<SportsAndVenue, String> column2 = new TableColumn<>("Venue");
        column2.setCellValueFactory(new PropertyValueFactory<>("venue"));
        column2.getStyleClass().add("column");
        column2.setMaxWidth(133);
        column2.setMinWidth(133);

        TableColumn<SportsAndVenue, String> column3 = new TableColumn<>("Event");
        column3.setCellValueFactory(new PropertyValueFactory<>("event"));
        column3.getStyleClass().add("column");
        column3.setMaxWidth(134);
        column3.setMinWidth(134);

        tableView.getColumns().addAll(column1, column2, column3);
        tableView.setItems(sportsAndVenues);

        VBox vBox = new VBox(tableView);
        StackPane pane = new StackPane(vBox);
        Scene scene = new Scene(pane, 400, 600);
        return scene;
    }
        
    public Scene finalStandings(){
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

            updateMedals(selectedCountry, 0, 0, 0);
            standingsListView.setItems(FXCollections.observableArrayList(" "));
        });

        Button btnBackToMenu = new Button("Back to Menu");
        btnBackToMenu.getStyleClass().add("btnScene2");
        btnBackToMenu.setOnAction(c -> {
            stage.setScene(showScene2());
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
        return scene;
    }

    public static void main(String[] args) {
        launch();
    }

    private void updateMedals(String country, int gold, int silver, int bronze) {
        Medals medals = countryMedals.getOrDefault(country, new Medals());
        medals.addMedals(gold, silver, bronze);
        countryMedals.put(country, medals);
    }

    private void updateStandings() {
        // Urutkan negara berdasarkan medali yang didapatkan
        List<Map.Entry<String, Medals>> sortedList = new ArrayList<>(countryMedals.entrySet());
        sortedList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Tampilkan urutan klasemen
        List<String> standings = new ArrayList<>();
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
            // Bandingkan berdasarkan medali emas terlebih dahulu
            if (this.gold != other.gold) {
                return Integer.compare(this.gold, other.gold);
            }

            // Jika medali emas sama, bandingkan berdasarkan medali perak
            if (this.silver != other.silver) {
                return Integer.compare(this.silver, other.silver);
            }

            // Jika medali perak sama, bandingkan berdasarkan medali perunggu
            return Integer.compare(this.bronze, other.bronze);
        }

        @Override
        public String toString() {
            return gold + " Emas, " + silver + " Perak, " + bronze + " Perunggu";
        }
    }

}