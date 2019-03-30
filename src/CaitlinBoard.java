import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.media.*;
import java.io.File;

public class CaitlinBoard extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button what = new Button("WHAT");
        Button englishPLS = new Button ("English PLZ");
        Button laugh1 = new Button ("Laugh 1");
        Button laugh2 = new Button ("Laugh 2");
        Button hoYA = new Button ("Ho Ya");
        Button hellYeah = new Button ("Hell Yeah");
        Button[] buttonArray = new Button[6];
        buttonArray[0] = what;
        buttonArray[1] = englishPLS;
        buttonArray[2] = laugh1;
        buttonArray[3] = laugh2;
        buttonArray[4] = hoYA;
        buttonArray[5] = hellYeah;

        Pane mainPane = new Pane();

        //Button Settings ==============
        for (Button element : buttonArray){
            element.setPrefSize(200,100);}

        for(Button element : buttonArray){
            mainPane.getChildren().add(element);
        }

        for (int i = 0; i < 6; i++){
            buttonArray[i].relocate(0, i*100);
        }

        //Loading sound files===============
        String hoYASound = "hoya.mp3";
        String whatSound = "what.mp3";
        String laugh1Sound = "laugh1.mp3";
        String laugh2Sound = "laugh2.mp3";
        String enlgishPLSSound = "english_pls.mp3";
        String hellYeahSound = "hellyeah.mp3";
        Media hySound = new Media(new File(hoYASound).toURI().toString());
        Media wSound = new Media(new File(whatSound).toURI().toString());
        Media hellySound = new Media(new File(hellYeahSound).toURI().toString());
        Media l1Sound = new Media(new File(laugh1Sound).toURI().toString());
        Media l2Sound = new Media(new File(laugh2Sound).toURI().toString());
        Media epSound = new Media(new File(enlgishPLSSound).toURI().toString());
        MediaPlayer hyPlay = new MediaPlayer(hySound);
        MediaPlayer wPlay = new MediaPlayer(wSound);
        MediaPlayer hellyPlay = new MediaPlayer(hellySound);
        MediaPlayer l1Play = new MediaPlayer(l1Sound);
        MediaPlayer l2Play = new MediaPlayer(l2Sound);
        MediaPlayer epPlay = new MediaPlayer(epSound);

        //Button Behaviour ===============
        what.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                wPlay.play();
            }
        });
        englishPLS.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                epPlay.play();
            }
        });
        laugh1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                l1Play.play();
            }
        });
        laugh2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                l2Play.play();
            }
        });
        hoYA.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                hyPlay.play();
            }
        });
        hellYeah.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                hellyPlay.play();
            }
        });

        Scene mainScene = new Scene(mainPane,200,600);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Caitlin 'Sweet Saucy Segs' Seguin - Soundboard");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
