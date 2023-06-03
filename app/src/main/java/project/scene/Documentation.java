package project.scene;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Documentation {
    private Stage stage;

    public Documentation (Stage stage){
    this.stage = stage;
    }

    public void show(){
        Label label = new Label("Documentation");

        ImageView imageView1 = new ImageView("./image/openingCeremony1.jpg");
        imageView1.setPreserveRatio(false);
        imageView1.setFitHeight(200);
        imageView1.setFitWidth(300);

        ImageView imageView2 = new ImageView("./image/openingCeremony2.jpg");
        imageView2.setPreserveRatio(false);
        imageView2.setFitHeight(200);
        imageView2.setFitWidth(300);

        Button btnNext = new Button("Next");
        btnNext.setOnAction(c -> {
            stage.setScene(documentation2());
        });

        Button btnBackToMenu = new Button("Back to Menu");
        // btnBackToMenu.getStyleClass().add("btnScene2");
        btnBackToMenu.setOnAction(c -> {
            MenuScene menuScene = new MenuScene(stage);
            menuScene.show();
        });

        VBox vBox = new VBox(label, imageView1, imageView2, btnNext, btnBackToMenu);
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.TOP_CENTER);

        StackPane pane = new StackPane(vBox);

        Scene scene = new Scene(pane, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public Scene documentation2() {
        Label label = new Label("Documentation");

        ImageView imageView1 = new ImageView("./image/openingCeremony3.jpg");
        imageView1.setPreserveRatio(false);
        imageView1.setFitHeight(200);
        imageView1.setFitWidth(300);

        ImageView imageView2 = new ImageView("./image/pawaiSeaGames.jpg");
        imageView2.setPreserveRatio(false);
        imageView2.setFitHeight(200);
        imageView2.setFitWidth(300);

        Button btnNext = new Button("Next");
        btnNext.setOnAction(c -> {
            stage.setScene(documentation3());
        });

        Button btnBack = new Button("Back");
        // btnBack.getStyleClass().add("btnScene2");
        btnBack.setOnAction(c -> {
            Documentation documentation = new Documentation(stage);
            documentation.show();
        });

        VBox vBox = new VBox(label, imageView1, imageView2, btnNext, btnBack);
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.TOP_CENTER);

        StackPane pane = new StackPane(vBox);

        Scene scene = new Scene(pane, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        stage.setScene(scene);
        return scene;
    }

    public Scene documentation3() {
        Label label = new Label("Documentation");

        ImageView imageView1 = new ImageView("./image/sepakBola1.jpg");
        imageView1.setPreserveRatio(false);
        imageView1.setFitHeight(200);
        imageView1.setFitWidth(300);

        ImageView imageView2 = new ImageView("./image/sepakBola2.jpg");
        imageView2.setPreserveRatio(false);
        imageView2.setFitHeight(200);
        imageView2.setFitWidth(300);

        Button btnNext = new Button("Next");
        btnNext.setOnAction(c -> {
            stage.setScene(documentation4());
        });

        Button btnBack = new Button("Back");
        // btnBack.getStyleClass().add("btnScene2");
        btnBack.setOnAction(c -> {
            stage.setScene(documentation2());
        });

        VBox vBox = new VBox(label, imageView1, imageView2, btnNext, btnBack);
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.TOP_CENTER);

        StackPane pane = new StackPane(vBox);

        Scene scene = new Scene(pane, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        stage.setScene(scene);
        return scene;
    }

    public Scene documentation4() {
        Label label = new Label("Documentation");

        ImageView imageView1 = new ImageView("./image/voliPutra.jpg");
        imageView1.setPreserveRatio(false);
        imageView1.setFitHeight(200);
        imageView1.setFitWidth(300);

        ImageView imageView2 = new ImageView("./image/voliPutri.jpg");
        imageView2.setPreserveRatio(false);
        imageView2.setFitHeight(200);
        imageView2.setFitWidth(300);

        Button btnNext = new Button("Next");
        btnNext.setOnAction(c -> {
            stage.setScene(documentation5());
        });

        Button btnBack = new Button("Back");
        // btnBack.getStyleClass().add("btnScene2");
        btnBack.setOnAction(c -> {
            stage.setScene(documentation3());
        });

        VBox vBox = new VBox(label, imageView1, imageView2, btnNext, btnBack);
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.TOP_CENTER);

        StackPane pane = new StackPane(vBox);

        Scene scene = new Scene(pane, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        stage.setScene(scene);
        return scene;
    }

    public Scene documentation5() {
        Label label = new Label("Documentation");

        ImageView imageView1 = new ImageView("./image/hockey.jpg");
        imageView1.setPreserveRatio(false);
        imageView1.setFitHeight(200);
        imageView1.setFitWidth(300);

        ImageView imageView2 = new ImageView("./image/lari.jpg");
        imageView2.setPreserveRatio(false);
        imageView2.setFitHeight(200);
        imageView2.setFitWidth(300);

        Button btnNext = new Button("Next");
        btnNext.setOnAction(c -> {
            stage.setScene(documentation6());
        });

        Button btnBack = new Button("Back");
        // btnBack.getStyleClass().add("btnScene2");
        btnBack.setOnAction(c -> {
            stage.setScene(documentation4());
        });

        VBox vBox = new VBox(label, imageView1, imageView2, btnNext, btnBack);
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.TOP_CENTER);

        StackPane pane = new StackPane(vBox);

        Scene scene = new Scene(pane, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        stage.setScene(scene);
        return scene;
    }

    public Scene documentation6() {
        Label label = new Label("Documentation");

        ImageView imageView1 = new ImageView("./image/lompat.jpg");
        imageView1.setPreserveRatio(false);
        imageView1.setFitHeight(200);
        imageView1.setFitWidth(300);

        ImageView imageView2 = new ImageView("./image/nanGun.jpg");
        imageView2.setPreserveRatio(false);
        imageView2.setFitHeight(200);
        imageView2.setFitWidth(300);

        Button btnNext = new Button("Next");
        btnNext.setOnAction(c -> {
            stage.setScene(documentation7());
        });

        Button btnBack = new Button("Back");
        // btnBack.getStyleClass().add("btnScene2");
        btnBack.setOnAction(c -> {
            stage.setScene(documentation5());
        });

        VBox vBox = new VBox(label, imageView1, imageView2, btnNext, btnBack);
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.TOP_CENTER);

        StackPane pane = new StackPane(vBox);

        Scene scene = new Scene(pane, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        stage.setScene(scene);
        return scene;
    }

    public Scene documentation7() {
        Label label = new Label("Documentation");

        ImageView imageView1 = new ImageView("./image/renang.jpg");
        imageView1.setPreserveRatio(false);
        imageView1.setFitHeight(200);
        imageView1.setFitWidth(300);

        ImageView imageView2 = new ImageView("./image/taekwondo.jpg");
        imageView2.setPreserveRatio(false);
        imageView2.setFitHeight(200);
        imageView2.setFitWidth(300);

        Button btnNext = new Button("Next");
        btnNext.setOnAction(c -> {
            stage.setScene(documentation8());
        });

        Button btnBack = new Button("Back");
        // btnBack.getStyleClass().add("btnScene2");
        btnBack.setOnAction(c -> {
            stage.setScene(documentation6());
        });

        VBox vBox = new VBox(label, imageView1, imageView2, btnNext, btnBack);
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.TOP_CENTER);

        StackPane pane = new StackPane(vBox);

        Scene scene = new Scene(pane, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        stage.setScene(scene);
        return scene;
    }

    public Scene documentation8() {
        Label label = new Label("Documentation");

        ImageView imageView1 = new ImageView("./image/tenis.jpg");
        imageView1.setPreserveRatio(false);
        imageView1.setFitHeight(200);
        imageView1.setFitWidth(300);

        ImageView imageView2 = new ImageView("./image/wushu.jpg");
        imageView2.setPreserveRatio(false);
        imageView2.setFitHeight(200);
        imageView2.setFitWidth(300);

        Button btnBack = new Button("Back");
        // btnBack.getStyleClass().add("btnScene2");
        btnBack.setOnAction(c -> {
            stage.setScene(documentation7());
        });

        VBox vBox = new VBox(label, imageView1, imageView2, btnBack);
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.TOP_CENTER);

        StackPane pane = new StackPane(vBox);

        Scene scene = new Scene(pane, 400, 600);
        scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
        return scene;
    }

}
