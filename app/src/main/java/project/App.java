package project;

import javafx.application.Application;
import javafx.stage.Stage;
import project.scene.HomeScene;

public class App extends Application{
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setResizable(false);
        primaryStage.setTitle("SEA App : Final Standing");

        HomeScene homeScene = new HomeScene(primaryStage);
        homeScene.show();
    }

    public static void main(String[] args) {
        launch();
    }
}