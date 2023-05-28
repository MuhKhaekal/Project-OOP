package project;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

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
        Label label = new Label("Select Menu");
        label.setFont(Font.font("Mali", 20));

        Button countryList = new Button("Country List");
        countryList.setId("btnCountryList");

        Button listSports = new Button("List Of Sports");
        listSports.setId("btnListSports");

        Button finalStandings = new Button("Final Standings");
        finalStandings.setId("btnFinalStandings");

        VBox vBox = new VBox(label, countryList, listSports, finalStandings);
        vBox.setAlignment(Pos.TOP_CENTER);
        vBox.setSpacing(15);

        StackPane pane = new StackPane(vBox);

        Scene scene2 = new Scene(pane, 400, 600);
        scene2.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        stage.setScene(scene2);
        return scene2;

    }

    public static void main(String[] args) {
        launch();
    }
}