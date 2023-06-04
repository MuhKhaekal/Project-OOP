package project.scene;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuScene {
    private Stage stage;

    public MenuScene(Stage stage){
        this.stage = stage;
    }
    public void show(){
    ImageView imageView = new ImageView("./image/bgScene2.png");
    imageView.setPreserveRatio(false);
    imageView.setFitHeight(600);
    imageView.setFitWidth(400);

    Label selectMenu = new Label("SELECT MENU");
    selectMenu.setId("lSelectMenu");

    Button btnParticipatingCountries = new Button("Patricipating Countries");
    btnParticipatingCountries.getStyleClass().add("btnScene2");
    btnParticipatingCountries.setOnAction(a -> {
        ParticipatingCountries participatingCountries = new ParticipatingCountries(stage);
        participatingCountries.show();
    });

    Button btnSports = new Button("Sports & Venue");
    btnSports.getStyleClass().add("btnScene2");
    btnSports.setOnAction(c -> {
        Sports sports = new Sports(stage);
        sports.show();
    });

    Button btnCalendar = new Button("Calendar");
    btnCalendar.getStyleClass().add("btnScene2");
    btnCalendar.setOnAction(c->{
        Calendar calendar = new Calendar(stage);
        calendar.show();
    });

    Button btnFinalStandings = new Button("Final Standings");
    btnFinalStandings.getStyleClass().add("btnScene2");
    btnFinalStandings.setOnAction(c -> {
        FinalStanding finalStanding = new FinalStanding(stage);
        finalStanding.show();
    });

    Button btnDocumentation = new Button("Documentation");
    btnDocumentation.getStyleClass().add("btnScene2");
    btnDocumentation.setOnAction(action -> {
        Documentation documentation = new Documentation(stage);
        documentation.show();
    });

    VBox vBox = new VBox(selectMenu, btnParticipatingCountries, btnSports, btnCalendar,
     btnFinalStandings,btnDocumentation);
    vBox.setAlignment(Pos.BASELINE_CENTER);
    vBox.setId("vBoxScene1");
    vBox.setSpacing(15);

    StackPane pane = new StackPane(imageView, vBox);

    Scene scene = new Scene(pane, 400, 600);
    scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());
    stage.setScene(scene);
    stage.show();
}

}

