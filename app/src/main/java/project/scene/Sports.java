package project.scene;

import org.checkerframework.checker.units.qual.m;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import project.models.Aquatics;
import project.models.Athletics;
import project.models.Basket;
import project.models.BuluTangkis;
import project.models.Chess;
import project.models.Cricket;
import project.models.Cycling;
import project.models.DanceSport;
import project.models.ESport;
import project.models.Fencing;
import project.models.Floorball;
import project.models.Billiard;
import project.models.Boxing;
import project.models.Football;
import project.models.Golf;
import project.models.Gymnastic;
import project.models.Hockey;
import project.models.Jetski;
import project.models.Judo;
import project.models.Karate;
import project.models.MartialArts;
import project.models.ObstacleRace;
import project.models.PencakSilat;
import project.models.Petanque;
import project.models.Sailing;
import project.models.SoftTennis;
import project.models.Sport;
import project.models.TableTennis;
import project.models.Taekwondo;
import project.models.Takraw;
import project.models.Tennis;
import project.models.Teqball;
import project.models.TraditionalBoatRace;
import project.models.Triathlon;
import project.models.Volleyball;
import project.models.Weightlifting;
import project.models.Wrestling;
import project.models.Wushu;

public class Sports{
    private Stage stage;
    private VBox bottomSide;

    public Sports(Stage stage){
        this.stage = stage;
    }

    public void show(){
        VBox root = new VBox();
        Scene scene = new Scene(root, 400,600);
        Label lListSports = new Label("List Sports");
        VBox vBoxListSports = new VBox(lListSports);
        vBoxListSports.setAlignment(Pos.TOP_CENTER);
        vBoxListSports.setPadding(new Insets(14));
        ScrollPane topSide = generateTopSide(scene.getHeight() * 0.4, scene.getWidth());
        bottomSide = generateBottomSide(scene.getHeight() * 0.6, scene.getWidth());
        changeMenu(1);

        root.getChildren().addAll(vBoxListSports,topSide, bottomSide);

        stage.setScene(scene);
        stage.show();
    }

    private void showSport(Sport sport){
        bottomSide.getChildren().clear();
        // Sport aquatics = new Aquatics();
        Label lname = new Label(sport.name());
        Label lvenue = new Label("Venue :");
        Text tVenue = new Text(sport.venue());
        Label lDescription = new Label("Description :");
        Text tDescription = new Text(sport.showDescription());
        TextFlow textFlow = new TextFlow(tDescription);
        Button btnBackToMenu = new Button("Back to Menu");
        btnBackToMenu.setOnAction(v->{
            MenuScene menuScene = new MenuScene(stage);
            menuScene.show();
        });
        VBox vBoxMenuScene = new VBox(btnBackToMenu);
        vBoxMenuScene.setAlignment(Pos.BOTTOM_CENTER);
        bottomSide.getChildren().addAll(lname,lvenue,tVenue,lDescription,textFlow,vBoxMenuScene);
    }

    private void changeMenu(int indexMenu) {
        Sport sport = null;
        switch (indexMenu) {
            case 1:
                sport = new Aquatics();
                break;
            case 2:
                sport = new Athletics();
                break;
            case 3:
                sport = new Basket();
                break;
            case 4:
                sport = new Billiard();
                break;
            case 5:
                sport = new Boxing();
                break;
            case 6:
                sport = new BuluTangkis();
                break;
            case 7:
                sport = new Chess();
                break;
            case 8:
                sport = new Cricket();
                break;
            case 9:
                sport = new Cycling();
                break;
            case 10:
                sport = new DanceSport();
                break;
            case 11:
                sport = new ESport();
                break;
            case 12:
                sport = new Fencing();
                break;
            case 13:
                sport = new Floorball();
                break;
            case 14:
                sport = new Football();
                break;
            case 15:
                sport = new Golf();
                break;
            case 16:
                sport = new Gymnastic();
                break;
            case 17:
                sport = new Hockey();
                break;
            case 18:
                sport = new Jetski();
                break;
            case 19:
                sport = new Judo();
                break;
            case 20:
                sport = new Karate();
                break;
            case 21:
                sport = new MartialArts();
                break;
            case 22:
                sport = new ObstacleRace();
                break;
            case 23:
                sport = new PencakSilat();
                break;
            case 24:
                sport = new Petanque();
                break;
            case 25:
                sport = new Sailing();
                break;
            case 26:
                sport = new SoftTennis();
                break;
            case 27:
                sport = new TableTennis();
                break;
            case 28:
                sport = new Taekwondo();
                break;
            case 29:
                sport = new Takraw();
                break;
            case 30:
                sport = new Tennis();
                break;
            case 31:
                sport = new Teqball();
                break;
            case 32:
                sport = new TraditionalBoatRace();
                break;
            case 33:
                sport = new Triathlon();
                break;
            case 34:
                sport = new Volleyball();
                break;
            case 35:
                sport = new Weightlifting();
                break;
            case 36:
                sport = new Wrestling();
                break;
            case 37:
                sport = new Wushu();
                break;
            default:
                break;
        }
    if (sport != null){
        showSport(sport);
    }
    }

    private ScrollPane generateTopSide(double width, double height) {
        VBox vBoxLayout = new VBox();
        vBoxLayout.setPrefSize(width, height);
        vBoxLayout.setMaxSize(width, height);
        vBoxLayout.setAlignment(Pos.TOP_CENTER);

        Region spaceBetween = new Region();
        HBox.setHgrow(spaceBetween, Priority.ALWAYS);

        vBoxLayout.getChildren().addAll(generateMenuItem());
        vBoxLayout.getChildren().addAll(spaceBetween);

        ScrollPane scrollPane = new ScrollPane(vBoxLayout);
        return scrollPane;
    }

    private VBox generateBottomSide(double width, double height) {
        VBox vboxMenu = new VBox();
        vboxMenu.setPrefSize(400, 600);
        vboxMenu.setMaxSize(400, 600);
        vboxMenu.setPadding(new Insets(12, 24, 24, 8));
        vboxMenu.getStyleClass().add("vbox-menu");
        
        return vboxMenu;
    }

    private HBox[] generateMenuItem() {
        Sport[] sports = {
            new Aquatics(),
            new Athletics(),
            new Basket(),
            new Billiard(),
            new Boxing(),
            new BuluTangkis(),
            new Chess(),
            new Cricket(),
            new Cycling(),
            new DanceSport(),
            new ESport(),
            new Fencing(),
            new Floorball(),
            new Football(),
            new Golf(),
            new Gymnastic(),
            new Hockey(),
            new Jetski(),
            new Judo(),
            new Karate(),
            new MartialArts(),
            new ObstacleRace(),
            new PencakSilat(),
            new Petanque(),
            new Sailing(),
            new SoftTennis(),
            new TableTennis(),
            new Taekwondo(),
            new Takraw(),
            new Tennis(),
            new Teqball(),
            new TraditionalBoatRace(),
            new Triathlon(),
            new Volleyball(),
            new Weightlifting(),
            new Wrestling(),
            new Wushu()
        };
        HBox[] listHboxMenu = new HBox[sports.length];

        for (int i = 0; i < listHboxMenu.length; i++) {
            Label labelMenu = new Label(sports[i].name());
            labelMenu.getStyleClass().add("label-menu");
            listHboxMenu[i] = new HBox(labelMenu);
            listHboxMenu[i].setPadding(new Insets(12, 20, 12, 20));
            listHboxMenu[i].setSpacing(4);
            changeMenuStatus(listHboxMenu[i], i == 0 ? true : false);
        }

        for (int i = 0; i < listHboxMenu.length; i++) {
            int index = i;
            listHboxMenu[i].setOnMouseClicked(v -> {

                changeMenuStatus(listHboxMenu[index], true);
                changeMenu(index + 1);

                for (int j = 0; j < listHboxMenu.length; j++) {
                    if (index != j) {
                        changeMenuStatus(listHboxMenu[j], false);
                    }
                }
            });
        }
        return listHboxMenu;
    }

    private void changeMenuStatus(HBox menu, boolean isActive) {
        if (isActive) {
            menu.getStyleClass().add("menu-active");
        } else {
            menu.getStyleClass().clear();
        }
    }

}
