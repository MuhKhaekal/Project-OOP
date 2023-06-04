package project.scene;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
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
import project.models.Activity;

public class Calendar {
    private Stage stage;
    private ObservableList<Activity> act = FXCollections.observableArrayList();

    public Calendar(Stage stage){
        this.stage = stage;   
    }
    public void show(){
        ImageView imageView = new ImageView("./image/bgParticipatingCountries.png");
        imageView.setPreserveRatio(false);
        imageView.setFitHeight(600);
        imageView.setFitWidth(400);

        act.addAll(new Activity("Opening Ceremony","Friday, 5th May"),
        new Activity("Athletics","May 6th\nMay 8th to 12th"),
        new Activity("Diving","May 8th to 11th"),
        new Activity("Finswimming","May 12th to 114th"),
        new Activity("Swimming","May 6th to 11th"),
        new Activity("Water Polo","May 12th to 16th"),
        new Activity("Badminton","May 6th to 16th"),
        new Activity("Basketball (5x5)","May 9th to 16th"),
        new Activity("Basketball (3x3)","May 6th to 17th"),
        new Activity("Billiards","May 7th to 14th"),
        new Activity("Boxing","May 6th to 14th"),
        new Activity("Chess (Xiangqi)","May 12th to May 15th"),
        new Activity("Chess (Ouk Chaktring)","April 29th to May 4th\nMay 6th to 9th"),
        new Activity("Cricket","April 29th to May 4th\nMay 6th to 9th"),
        new Activity("Cycling (Road Race)","May 11th to 13"),
        new Activity("Cycling (Mountain Race)","May 6th to 8"),
        new Activity("Dance Sport","May 16th"),
        new Activity("E-Sports","May 6th to 15th"),
        new Activity("Fencing","May 11th to 16th"),
        new Activity("Floorball","May 11th to 16th"),
        new Activity("Football","April 29th to May 4th\n6May 6th to 16th"),
        new Activity("Golf","May 8th to 13th"),
        new Activity("Gymnastic (Artistic)","May 8th to 9th"),
        new Activity("Gymnastic (Aerobik)","May 13th to 14th"),
        new Activity("Hockey (Field)","May 9th to 16th"),
        new Activity("Hockey (Indoor)","May 1st to 4th\nMay 6th to 7th"),
        new Activity("Jetski","May 13th to 16th"),
        new Activity("Judo","May 13th to 16th"),
        new Activity("Karate","May 6th to 8th"),
        new Activity("Martial Arts (Arnis)","May 14th to 16th"),
        new Activity("Martial Arts (Jujitsu)","May 4th,\nMay 6th to 7th"),
        new Activity("Martial Arts (Kick Boxing)","May 13th to 16th"),
        new Activity("Martial Arts (Kun Bokator)","May 4th, May 6th to 8th"),
        new Activity("Martial Arts (Kun Khmer)","May 6th to 11th"),
        new Activity("Martial Arts (Vovinam)","May 6th to 9th"),
        new Activity("Obstacle Race","May 3th to 4th, May 6th to 7th"),
        new Activity("Pencak Silat","May 6th to 10th"),
        new Activity("Petanque","May 6th to 13th"),
        new Activity("Sailing","May 1st to 4th\nMay 6th to 7th"),
        new Activity("Sepak Takraw","May 6th to 16th"),
        new Activity("Soft Tennis","May 6th to 10th"),
        new Activity("Table Tennis","May 9th to 16th"),
        new Activity("Taekewondo","May 12th to 15th"),
        new Activity("Tennis","May 6th to 14th"),
        new Activity("Teqball","May 6th to 8th"),
        new Activity("Traditional Boat Race","May 13th to 14th\nMay 16th"),
        new Activity("Volleyball (Indoor)","May 3th to 4th\nMay 6th to 14th"),
        new Activity("Volleyball (Beach)","May 11th to 16th"),
        new Activity("Weightlifting","May 13th to 16th"),
        new Activity("Wrestling","May 14th to 16th"),
        new Activity("Wushu","May 9th to 12th")
        );
        Label label = new Label ("Schedule");
        label.setId("lSchedule");
        TableView<Activity> tableView = new TableView<>();

        TableColumn<Activity, String> activityColumn = new TableColumn<>("Activity");
        activityColumn.getStyleClass().add("column");
        activityColumn.setCellValueFactory(new PropertyValueFactory<>("activity"));
        activityColumn.setMaxWidth(188);
        activityColumn.setMinWidth(188);

        TableColumn<Activity, String> dateColumn = new TableColumn<>("Day and Date");
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        dateColumn.getStyleClass().add("column");
        dateColumn.setMaxWidth(188);
        dateColumn.setMinWidth(188);
        
        tableView.getColumns().addAll(activityColumn, dateColumn);
        tableView.setFixedCellSize(44);
        tableView.setItems(act);
        tableView.setMinHeight(500);

        Button btnBackToMenu = new Button("Back to Menu");
        btnBackToMenu.getStyleClass().add("btnBacktoMenuCalendar");
        btnBackToMenu.setOnAction(x->{
            MenuScene menuScene = new MenuScene(stage);
            menuScene.show();
        });
        VBox vbox = new VBox(label,tableView,btnBackToMenu);
        vbox.setPadding(new Insets(16));
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.TOP_CENTER);
        StackPane pane = new StackPane(imageView,vbox);

        Scene scene = new Scene(pane, 400,600);
        scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

   

}

