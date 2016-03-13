/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pictureframe;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Zachary Murphy
 */
public class PictureFrame extends Application {
    //array of files
    String [] imageFiles = {"1.png", "2.png", "3.png"};
    //some numbers for processing     
    int i = imageFiles.length;
     int x =1;
     //stage 
    @Override
    public void start(Stage primaryStage) throws Exception {
      //label that will hold image
        Label image = new Label();

      
        //stack pane set
        StackPane root = new StackPane();
        //allignment centered
        root.setAlignment(Pos.CENTER);
        
        //handler makes images change
        EventHandler<ActionEvent> hander= event->{
            x++;
            root.getChildren().clear();
            root.getChildren().addAll(image, new ImageView (imageFiles[x -1]));
            if (x == i){
                x=0;
            }
        };
        //durartion per image w/ keyframe
        Duration sec = new Duration (2000);
        KeyFrame keyframe = new KeyFrame (sec, hander);
        //timeline called
        Timeline timeline = new Timeline(keyframe);
        timeline.setCycleCount(Animation.INDEFINITE);
        
        
        //getting all times for the stage.
        root.getChildren().addAll(image, new ImageView(imageFiles[x-1]));
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.setTitle("Digital Image Slider");
        primaryStage.show();
        timeline.playFromStart();
    }
//main method
    public static void main(String[] args) {
        launch(args);
    }
}