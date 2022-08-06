/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author rajat
 */
public class App extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("cart.fxml"));
        Scene scene = new Scene(root);
        
        
        
        stage.setTitle("Sheridan shopping cart");
        stage.setScene(scene);
        stage.show();
        
    }
    public static void main(String[] args){
        launch(args);
    }
}
