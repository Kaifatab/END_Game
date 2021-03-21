package Experimental;

import java.io.FileInputStream;
import javafx.application.Application;
import static javafx.application.Application.launch;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class Experimental extends Application {


    @Override
    public void start(Stage stage) throws Exception{
        BorderPane pane = new BorderPane();
        pane.setMinHeight(400);
        pane.setMinWidth(749);
        pane.setStyle("-fx-background-color: Black");


        Text txt = new Text("Welcome To The World Of Avengers!!!");
        txt.setFill(Color.BEIGE);
        txt.setFont(Font.font("OCR A Extended",FontWeight.BOLD,FontPosture.REGULAR,30));
        txt.setStrokeWidth(2);
        txt.setStroke(Color.CADETBLUE);


        VBox v = new VBox();
        v.setMinHeight(75);
        v.setMinWidth(500);
        v.setAlignment(Pos.CENTER);
        v.setStyle("-fx-background-color:black");
        v.getChildren().add(txt);



        // here goes the play button
        //image for button
        FileInputStream input1 = new FileInputStream("E:\\Java_Project\\src\\pics\\Play.png");
        Image play_button = new Image(input1);
        ImageView Play = new ImageView(play_button);

        Button btn_play = new Button("",Play);
        btn_play.setAlignment(Pos.BOTTOM_CENTER);

        btn_play.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //window box = new window();
                //level2 box = new level2();
                level3 box = new level3();
                stage.close();
            }
        });


        // here goes the exit button
        //image for button
        FileInputStream input2 = new FileInputStream("E:\\Java_Project\\src\\pics\\Exit.jpg");
        Image exit_button = new Image(input2);
        ImageView Exit = new ImageView(exit_button);

        Button btn_exit = new Button("",Exit);
        btn_exit.setStyle("-fx-background-color: Black");

        btn_exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
            }
        });


        // here goes the Help button
        //image for button
        FileInputStream input3 = new FileInputStream("E:\\Java_Project\\src\\pics\\Help.jpg");
        Image help_button = new Image(input3);
        ImageView Help = new ImageView(help_button);

        Button btn_help = new Button("",Help);
        btn_help.setStyle("-fx-background-color: Black");

        btn_help.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Help box = new Help();
                //stage.close();
            }
        });





        HBox h = new HBox();
        h.setMinHeight(50);
        h.setMinWidth(500);
        h.setAlignment(Pos.CENTER);
        h.setStyle("-fx-background-color: Black");


        h.getChildren().addAll(btn_exit,btn_help);

        Image ig = new Image("/pics/first_background.jpg");
        ImageView i = new ImageView(ig);
        i.setX(0);
        i.setY(0);
        i.setFitHeight(500);
        i.setFitWidth(749);
        i.setPreserveRatio(true);


        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(i);
        stackPane.getChildren().add(btn_play);


        //stackPane.getChildren().add(btn_exit);


        //pane.setTop(v);
        pane.setBottom(h);
        pane.setCenter(stackPane);


        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}