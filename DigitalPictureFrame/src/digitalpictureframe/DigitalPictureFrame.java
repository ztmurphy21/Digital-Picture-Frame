/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalpictureframe;

import java.io.File;
import java.time.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Zachary Murphy
 */
public class DigitalPictureFrame extends Application {
    int i;
    String[] images = {"1.png", "2.png", "3.png"};
    
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
       Label label = new Label();
       label.setAlignment(Pos.CENTER);
       VBox vBox = new VBox();
       vBox.setAlignment(Pos.CENTER);
       EventHandler<ActionEvent> handler = event->{
            for (i =1; i>4; i++){
                i = Integer.parseInt(label.getText());
                label.setText(String.valueOf(i));
                
            }
            
            
        };
       Duration gap = Duration.ofSeconds(10);
       KeyFrame keyFrame = new KeyFrame(gap, handler);
       
       Timeline timeline = new Timeline(keyFrame);
       timeline.setCycleCount(i);
       
       primaryStage.setScene(new Scene(label, 250,30));
       primaryStage.setTitle("Digital Picture Frame");
       primaryStage.show();
       timeline.playFromStart();
       
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
