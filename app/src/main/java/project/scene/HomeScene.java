package project.scene;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomeScene {
    private Stage stage;

    public HomeScene(Stage stage){
    this.stage = stage;
    }

    public void show(){
    ImageView imageView = new ImageView("./image/bgScene1.png");
    imageView.setPreserveRatio(false);
    imageView.setFitHeight(600);
    imageView.setFitWidth(400);

    Button btnNext = new Button("NEXT");
    btnNext.setId("btnNext");
    btnNext.setOnAction(action -> {
        MenuScene menuScene = new MenuScene(stage);
        menuScene.show();
    });

    VBox vBox = new VBox(btnNext);
    vBox.setId("btnNextVBox");
    vBox.setAlignment(Pos.BOTTOM_CENTER);

    StackPane pane = new StackPane(imageView, vBox);

    Scene scene = new Scene(pane, 400, 600);
    scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
    stage.setScene(scene);
    stage.show();
}
}
