/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pictureframe;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Zachary Murphy
 */
public class PictureFrame extends Application {
    
    @Override
    public void start(Stage primaryStage) {
         //getting the images
        Image image1 = new Image("1.png");
        Image image2 = new Image("2.png");
        Image image3 = new Image("3.png");
        //image view needed for image vieiwing 
        ImageView imageView = new ImageView();
        //new timline
        Timeline timeline = new Timeline(
                //keyframs per image file
                new KeyFrame(Duration.ZERO, new KeyValue(imageView.imageProperty(), image1)),
            new KeyFrame(Duration.seconds(1), new KeyValue(imageView.imageProperty(), image2)),  
            new KeyFrame(Duration.seconds(2), new KeyValue(imageView.imageProperty(), image3)),
            new KeyFrame(Duration.seconds(4), new KeyValue(imageView.imageProperty(), null))
            );
        //play method to timeline called
        timeline.play();
        //setting up stack pane
        StackPane root = new StackPane();
        
        //getting all times for the stage.
        root.getChildren().add(imageView);
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}