package project.scene;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import project.models.Aquatics;
import project.models.Athletics;
import project.models.Sport;

public class Sports {
    private Stage stage;
    
    public Sports(Stage stage){
        this.stage = stage;
    }

    public void show(){
        Sport athletics = new Athletics();
        Sport aquatics = new Aquatics();
        Label lSportsAndVenue = new Label("Sports And Venue");
        
        Button btnAthletics = new Button("Athletics");
        btnAthletics.setOnAction(q->{
            ImageView imageView = new ImageView("image/athletics.png");
            imageView.setPreserveRatio(false);
            imageView.setFitHeight(600);
            imageView.setFitWidth(400);
            
            Label lAthletics = new Label("Athletics");
            Label lDescription = new Label("Description :");
            lDescription.getStylesheets().add("lDescription");
            Label lVenue = new Label("Venue :");
            lVenue.getStylesheets().add("lVenue");
            Text text = new Text(athletics.showDescription());
            Text textVenue = new Text(athletics.venue());
            Button btnBack = new Button("Back");
            btnBack.setOnAction(w->{
                MenuScene menuScene = new MenuScene(stage);
                menuScene.show();
            });
            TextFlow tFlow = new TextFlow(text);
            VBox vBoxLabel = new VBox(lAthletics);
            vBoxLabel.setAlignment(Pos.TOP_CENTER);
            VBox vBox = new VBox(vBoxLabel,lVenue,textVenue,lDescription,tFlow,btnBack);

            Scene athleticScene = new Scene(new StackPane(imageView,vBox), 400, 600);
            athleticScene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
            stage.setScene(athleticScene);  
        });
        Button btnAquatics = new Button("Aquatics");
        btnAquatics.setOnAction(r->{
            ImageView imageView = new ImageView("image/aquatics.png");
            imageView.setPreserveRatio(false);
            imageView.setFitHeight(600);
            imageView.setFitWidth(400);
            
            Label lAthletics = new Label("Aquatics");
            Label lVenue = new Label("Venue :");
            ImageView imageView2 = new ImageView("image/volleyball.png");
            imageView2.setPreserveRatio(false);
            imageView2.setFitHeight(200);
            imageView2.setFitWidth(300);

            lVenue.getStylesheets().add("lVenue");
            Text textVenue = new Text(aquatics.venue());
            Label lDescription = new Label("Description :");
            lDescription.getStylesheets().add("lDescription");
            Text text = new Text(aquatics.showDescription());
            Button btnBack = new Button("Back");
            btnBack.setOnAction(w->{
                MenuScene menuScene = new MenuScene(stage);
                menuScene.show();
            });
            TextFlow tFlow = new TextFlow(text);
            VBox vBoxLabel = new VBox(lAthletics);
            vBoxLabel.setAlignment(Pos.TOP_CENTER);
            VBox vBox = new VBox(vBoxLabel,lVenue,imageView2,textVenue,lDescription,tFlow,btnBack);

            Scene aquaticsScene = new Scene(new StackPane(imageView,vBox), 400, 600);
            aquaticsScene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
            stage.setScene(aquaticsScene);  
        });
        Button btnBadminton = new Button("Badminton");
        btnBadminton.setOnAction(r->{
            ImageView imageView = new ImageView("image/aquatics.png");
            imageView.setPreserveRatio(false);
            imageView.setFitHeight(600);
            imageView.setFitWidth(400);
            
            Label lAthletics = new Label("Aquatics");
            Label lDescription = new Label("Description :");
            lDescription.getStylesheets().add("lDescription");
            Label lVenue = new Label("Venue :");
            lVenue.getStylesheets().add("lVenue");
            Text text = new Text(aquatics.showDescription());
            Text textVenue = new Text(aquatics.venue());
            Button btnBack = new Button("Back");
            btnBack.setOnAction(w->{
                MenuScene menuScene = new MenuScene(stage);
                menuScene.show();
            });
            TextFlow tFlow = new TextFlow(text);
            VBox vBoxLabel = new VBox(lAthletics);
            vBoxLabel.setAlignment(Pos.TOP_CENTER);
            VBox vBox = new VBox(vBoxLabel,lVenue,textVenue,lDescription,tFlow,btnBack);

            Scene aquaticsScene = new Scene(new StackPane(imageView,vBox), 400, 600);
            aquaticsScene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
            stage.setScene(aquaticsScene);  
        });
        Button btnBasketball = new Button("BasketBall");
        Button btnBilliard = new Button("Billiard");
        Button btnBoxing = new Button("Boxing");
        Button btnChess = new Button("Chess");
        Button btnCricket = new Button("Cricket");
        Button btnCycling = new Button("Cycling");
        Button btnDanceSports = new Button("Dance Sports");
        Button btnESports = new Button("E-Sports");
        Button btnFencing = new Button("Fencing");
        Button btnFloorball = new Button("Floorball");
        Button btnFootball = new Button("Football");
        Button btnGolf = new Button("Golf");
        Button btnGymnastic = new Button("Gymnastic");
        Button btnHockey = new Button("Hockey");
        Button btnJetski = new Button("Jetski");
        Button btnJudo = new Button("Judo");
        Button btnKarate = new Button("Karate");
        Button btnMartialArts = new Button("Martial Arts");
        Button btnObstacleRace = new Button("Obstacle Race");
        Button btnPencakSilat = new Button("Pencak Silat");
        Button btnPetanque = new Button("Petanque");
        Button btnSailing = new Button("Sailing");
        Button btnTakraw = new Button("Takraw");
        Button btnSoftTennis = new Button("Soft Tennis");
        Button btnTableTennis = new Button("Table Tennis");
        Button btnTaekwondo = new Button("Taekwondo");
        Button btnTennis = new Button("Tennis");
        Button btnTraditionalBoatRace = new Button("Traditional Boat Race");
        Button btnTriathlon = new Button("Triathlon");
        Button btnVolleyball = new Button("Volleyball");
        Button btnWeightlifting = new Button("Weightlifting");
        Button btnWrestling = new Button("Wrestling");
        Button btnWushu = new Button("Wushu");
        Button btnTeqball = new Button("Teqball");

        Button btnBackToMenu = new Button("Back to Menu");
        
        HBox hBox1 = new HBox(btnAquatics,btnAthletics,btnBadminton);
        hBox1.setAlignment(Pos.TOP_CENTER);
        hBox1.setSpacing(12);
        HBox hBox2 = new HBox(btnBasketball,btnCycling,btnBilliard);
        hBox2.setAlignment(Pos.TOP_CENTER);
        hBox2.setSpacing(12);
        HBox hBox3 = new HBox(btnBoxing,btnChess,btnCricket);
        hBox3.setAlignment(Pos.TOP_CENTER);
        hBox3.setSpacing(12);
        HBox hBox4 = new HBox(btnDanceSports,btnESports,btnFencing);
        hBox4.setAlignment(Pos.TOP_CENTER);
        hBox4.setSpacing(12);
        HBox hBox5 = new HBox(btnFloorball,btnFootball,btnGolf);
        hBox5.setAlignment(Pos.TOP_CENTER);
        hBox5.setSpacing(12);
        HBox hBox6 = new HBox(btnGymnastic,btnHockey,btnJetski);
        hBox6.setAlignment(Pos.TOP_CENTER);
        hBox6.setSpacing(12);
        HBox hBox7 = new HBox(btnJudo,btnKarate,btnMartialArts);
        hBox7.setAlignment(Pos.TOP_CENTER);
        hBox7.setSpacing(12);
        HBox hBox8 = new HBox(btnObstacleRace,btnPencakSilat,btnPetanque);
        hBox8.setAlignment(Pos.TOP_CENTER);
        hBox8.setSpacing(12);
        HBox hBox9 = new HBox(btnSailing,btnTakraw,btnSoftTennis);
        hBox9.setAlignment(Pos.TOP_CENTER);
        hBox9.setSpacing(12);
        HBox hBox10 = new HBox(btnTableTennis,btnTaekwondo,btnTennis);
        hBox10.setAlignment(Pos.TOP_CENTER);
        hBox10.setSpacing(12);
        HBox hBox11 = new HBox(btnTeqball,btnTraditionalBoatRace,btnTriathlon);
        hBox11.setAlignment(Pos.TOP_CENTER);
        hBox11.setSpacing(12);
        HBox hBox12 = new HBox(btnVolleyball,btnWeightlifting,btnWrestling);
        hBox12.setAlignment(Pos.TOP_CENTER);
        hBox12.setSpacing(12);
        HBox hBox13 = new HBox(btnWushu);
        hBox13.setAlignment(Pos.TOP_CENTER);
        hBox13.setSpacing(12);
        VBox vBoxLabel = new VBox(lSportsAndVenue);
        vBoxLabel.setAlignment(Pos.TOP_CENTER);
        VBox vBox = new VBox(hBox1,hBox2,hBox3,hBox4,hBox5,hBox6,hBox7,hBox8,hBox9,hBox10,hBox11,hBox12,hBox13, btnBackToMenu);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(12);
        StackPane pane = new StackPane(vBoxLabel,vBox);
        Scene scene = new Scene(pane, 400,600);
        stage.setScene(scene);
        stage.show();
    }
}