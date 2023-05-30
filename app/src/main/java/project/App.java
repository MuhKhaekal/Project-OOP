package project;

import javafx.application.Application;
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

public class App extends Application {
    private Stage stage;

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
        btnParticipatingCountries.setOnAction(a->{
            stage.setScene(partcipatingCountries());
        });

        Button btnSports = new Button("Sports");
        btnSports.getStyleClass().add("btnScene2");

        Button btnCalendar = new Button("Calendar");
        btnCalendar.getStyleClass().add("btnScene2");

        Button btnFinalStandings = new Button("Final Standings");
        btnFinalStandings.getStyleClass().add("btnScene2");
        
        Button  btnDocumentation = new Button("Documentation");
        btnDocumentation.getStyleClass().add("btnScene2");

        VBox vBox = new VBox(selectMenu, btnParticipatingCountries, btnSports, btnCalendar, btnFinalStandings, btnDocumentation);
        vBox.setAlignment(Pos.BASELINE_CENTER);
        vBox.setId("vBoxScene1");
        vBox.setSpacing(15);

        StackPane pane = new StackPane(imageView,vBox);

        Scene scene2 = new Scene(pane, 400, 600);
        scene2.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        stage.setScene(scene2);
        return scene2;
    }

    public Scene partcipatingCountries(){
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
        
        TableColumn<Country, String> column2 = new TableColumn<>("Sports");
        column2.setCellValueFactory(new PropertyValueFactory<>("sport"));
        column2.getStyleClass().add("column");
        column2.setMaxWidth(133);
        column2.setMinWidth(133);

        TableColumn<Country, String> column3 = new TableColumn<>("Athletes");
        column3.setCellValueFactory(new PropertyValueFactory<>("atlet"));
        column3.getStyleClass().add("column");
        column3.setMaxWidth(134);
        column3.setMinWidth(134);
        
        tableView.getColumns().addAll(column1,column2,column3);
        tableView.setItems(country);
        
        Button btnBackToHome = new Button("Back To Home");
        btnBackToHome.getStyleClass().add("btnScene2");
        btnBackToHome.setOnAction(b->{
            stage.setScene(showScene2());
        });

        tableView.setFixedCellSize(33);
        tableView.getStyleClass().add("table-view");
        VBox vbox = new VBox(lParticipatingCountries,tableView);
        vbox.setId("vboxParticipatingCountries");
        vbox.setAlignment(Pos.TOP_CENTER);

        VBox vbox2 = new VBox(btnBackToHome);
        vbox2.setId("vboxParticipatingCountries2");
        vbox2.setAlignment(Pos.BOTTOM_CENTER);
        
        StackPane pane = new StackPane(imageView,vbox ,vbox2);
        Scene scene = new Scene(pane, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        return scene;
    }

    // public Scene sports(){
    //     Label sports = new Label("Sports");
    // }

    public static void main(String[] args) {
        launch();
    }
}