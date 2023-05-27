package project;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{
    private Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception {
    stage = primaryStage;
    stage.setTitle("SEA App : Final Standing");
    stage.setResizable(false);
    stage.setScene(showScene1());
    stage.show();
    }

    public Scene showScene1(){
    ImageView imageView = new ImageView("./image/bgScene1.png");
    imageView.setPreserveRatio(false);
    
    Button btnNext = new Button("NEXT");
    btnNext.setId("btnNext");
    
    VBox vBox = new VBox(btnNext);
    vBox.setId("btnNextVBox");
    vBox.setAlignment(Pos.BOTTOM_CENTER);
   
    StackPane pane = new StackPane(imageView,vBox);
   
    Scene scene = new Scene(pane, 400, 600);
    scene.getStylesheets()
        .add(getClass()
            .getResource("/style/style.css")
            .toExternalForm());
    return scene;
    }

    public static void main(String[] args) {
        launch();
    }
}