package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BeautifyName extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(5);
        grid.setHgap(5);

        final TextField firstName = new TextField();
        firstName.setPromptText("Enter your first name");
        firstName.setPrefColumnCount(10);
        firstName.getText();
        GridPane.setConstraints(firstName, 0, 0);
        grid.getChildren().add(firstName);

        final TextField lastName = new TextField();
        lastName.setPromptText("Enter your last name");
        GridPane.setConstraints(lastName, 0, 1);
        grid.getChildren().add(lastName);

        Button submit = new Button("Submit");
        GridPane.setConstraints(submit, 1, 0);
        grid.getChildren().add(submit);

        Button clear = new Button("Clear");
        GridPane.setConstraints(clear, 1, 1);
        grid.getChildren().add(clear);

        final Label label = new Label();
        GridPane.setConstraints(label, 0, 3);
        GridPane.setColumnSpan(label, 2);
        grid.getChildren().add(label);


        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                label.setText(String.format("Your name is: %s %s", firstName.getText(), lastName.getText()));
                //String reverse = new StringBuilder(firstName.getText() + " " + lastName.getText()).reverse().toString();
                //label.setText(reverse);
            }
        });

        clear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText(null);
                firstName.clear();
                lastName.clear();
            }
        });



        Scene scene = new Scene(grid);
        primaryStage.setTitle("Click Me");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
