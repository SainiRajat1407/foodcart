/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping;

import java.util.Optional;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import javafx.stage.Stage;

/**
 *
 * @author rajat and Arpan
 */
public class App extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("cart.fxml"));
        Scene scene = new Scene(root);
        
       //Adding a confirmarion on the window close request
       
        stage.setOnCloseRequest(e -> {
            e.consume();
            Alert alertBoxExit = new Alert(Alert.AlertType.CONFIRMATION);
            alertBoxExit.setTitle("Exit Window Confirmation");
            alertBoxExit.setContentText("Do you want to exit the Application?");
            //accessing the confirmation box result

            Optional<ButtonType> userAnswer = alertBoxExit.showAndWait();
            if(userAnswer.get() == ButtonType.OK){
                stage.close();
            }});
        stage.setTitle("Sheridan shopping cart");
        stage.setScene(scene);
        stage.show();
        
    }
    public static void main(String[] args){
        launch(args);
    }
}
