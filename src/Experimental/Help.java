package Experimental;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Help {

    private AnchorPane pane;

    Help(){

        Image img = new Image("/pics/guideline.jpg");
        ImageView instruction = new ImageView(img);
        instruction.setFitHeight(442);
        instruction.setFitWidth(624);
        instruction.setPreserveRatio(true);


        pane = new AnchorPane();
        pane.setStyle("-fx-background-color: Black");
        pane.setMinHeight(440);
        pane.setMinWidth(622);
        pane.setMaxHeight(440);
        pane.setMaxWidth(622);
        pane.getChildren().add(instruction);


        Scene scene = new Scene(pane);
        scene.getRoot().requestFocus();
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

}
