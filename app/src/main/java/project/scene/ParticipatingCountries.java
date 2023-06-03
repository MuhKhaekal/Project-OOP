package project.scene;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import project.datasource.CountryDataSource;
import project.models.Country;

public class ParticipatingCountries {
    private Stage stage;

    public ParticipatingCountries (Stage stage){
        this.stage = stage;
    }

    public void show(){
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
            MenuScene menuScene = new MenuScene(stage);
            menuScene.show();
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
        stage.setScene(scene);
        stage.show();
    }
}
