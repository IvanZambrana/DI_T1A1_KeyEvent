/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package keyevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Ivan
 */
public class KeyEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    
        //Text
        Text text = new Text(20, 20, "A");
        text.setFocusTraversable(true);
        
        //KeyEvent
        text.setOnKeyPressed(e -> {
            switch(e.getCode()) {
                case UP:
                    text.setY(text.getY() - 10);
                    break;
                case DOWN:
                    text.setY(text.getY() + 10);
                    break;
                case LEFT:
                    text.setX(text.getX() - 10);
                    break;
                case RIGHT:
                    text.setX(text.getX() + 10);
                    break;
                default:
                    text.setText(text.getText() + e.getCode());
                    break;
            }
        });
        
        //Pane and Scene
        Pane root = new Pane();
        root.getChildren().add(text);
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
