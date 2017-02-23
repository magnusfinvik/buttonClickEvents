package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        HBox pane = new HBox(10);

        pane.setAlignment(Pos.CENTER);

        final TextField textArea = new TextField();
        Button btOk = new Button("OK");
        Button btCancel = new Button("Cancel");

        btOk.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textArea.setText("OK clicked");
            }
        });

        btCancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                textArea.setText("Cancel clicked");
            }
        });


        pane.getChildren().addAll(btOk, btCancel, textArea);



        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Click Me");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}


/** Mads har liggende eksempler på handlere på github, blant annet
 *          Https://gitlab.com/mbergdal/ITE1900/blob/master/src/com/headcrest/fx/events/ControlCircle.java
 * */
