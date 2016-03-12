/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalpictureframe;

import java.io.File;
//import java.time.Duration;
import java.util.Arrays;
import javafx.util.Duration;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
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

/**
 *
 * @author Zachary Murphy
 */
public class DigitalPictureFrame extends Application {


    @Override
    public void start(Stage primaryStage) {
          
        Image image1 = new Image("1.png");
        Image image2 = new Image("2.png");
        Image image3 = new Image("3.png");
        ImageView imageView = new ImageView();
        Timeline timeline = new Timeline(

                new KeyFrame(Duration.ZERO, new KeyValue(imageView.imageProperty(), image1)),
            new KeyFrame(Duration.seconds(1), new KeyValue(imageView.imageProperty(), image2)),  
            new KeyFrame(Duration.seconds(2), new KeyValue(imageView.imageProperty(), image3)),
            new KeyFrame(Duration.seconds(4), new KeyValue(imageView.imageProperty(), null))
            );
        timeline.play();
        StackPane root = new StackPane();
        root.getChildren().add(imageView);
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}