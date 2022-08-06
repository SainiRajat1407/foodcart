/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 *
 * @author rajat
 */
public class TextFieldMethods {
    
    public void tfWhiteTextControl(TextField tfWhite, Label errorMessage,
                                   RadioButton radioCafe,RadioButton radioRegular,
                                   RadioButton radioCappaccino, Button btn_total){
        try{
            if(!tfWhite.getText().isEmpty() ){
                if(Integer.parseInt(tfWhite.getText()) <= 8&&
                   Integer.parseInt(tfWhite.getText()) >=1){
                    radioRegular.setDisable(false);
                    radioCafe.setDisable(false);
                    radioCappaccino.setDisable(false);
                    errorMessage.setText("");
                    btn_total.setDisable(false);

                }
                else{
                    errorMessage.setText("BAGEL LIMIT EXCEEDED!");
                    btn_total.setDisable(true);
                    radioRegular.setDisable(true);
                    radioCafe.setDisable(true);
                    radioCappaccino.setDisable(true);
                }
                if(Integer.parseInt(tfWhite.getText()) <= 1){
                    errorMessage.setText("ENTER THE QUANTITY");
                    btn_total.setDisable(true);
                }
            }
        }catch(NumberFormatException e){
            errorMessage.setText("ENTER A NUMERIC VALUE!");
            btn_total.setDisable(true);
        }
    }
    
    
    public void tfWholeTextControl(TextField tfWholeWheat , Label errorMessage,
                                   RadioButton radioCafe,RadioButton radioRegular,
                                   RadioButton radioCappaccino, Button btn_total){
        try{
            if(!tfWholeWheat.getText().isEmpty() ){
                if(Integer.parseInt(tfWholeWheat.getText()) <= 8&&
                        Integer.parseInt(tfWholeWheat.getText()) >=1 ){
                    radioRegular.setDisable(false);
                    radioCafe.setDisable(false);
                    radioCappaccino.setDisable(false);
                    errorMessage.setText("");
                    btn_total.setDisable(false);
                }
                else{
                    errorMessage.setText("BAGEL LIMIT EXCEEDED!");
                    btn_total.setDisable(true);
                    radioRegular.setDisable(true);
                    radioCafe.setDisable(true);
                    radioCappaccino.setDisable(true);
                }if(Integer.parseInt(tfWholeWheat.getText()) <= 1){
                    errorMessage.setText("ENTER THE QUANTITY");
                    btn_total.setDisable(true);
                }
            }
        }catch(NumberFormatException e){
            errorMessage.setText("ENTER A NUMERIC VALUE!");
            btn_total.setDisable(true);
        }
        
    }
    
    
    public void tfRegularTextControl(TextField tfRegular, Label coffeeErrorMessage,
                                     Button btn_total ){
        try{
            if(!tfRegular.getText().isEmpty() ){
                if(Integer.parseInt(tfRegular.getText()) <= 8&&
                        Integer.parseInt(tfRegular.getText()) >=1 ){
                    coffeeErrorMessage.setText("");
                    btn_total.setDisable(false);
                }
                else{
                    coffeeErrorMessage.setText("COFFEE LIMIT EXCEEDED!");
                    btn_total.setDisable(true);
                }
                if(Integer.parseInt(tfRegular.getText()) <= 1){
                    coffeeErrorMessage.setText("ENTER THE QUANTITY");
                    btn_total.setDisable(true);
                }
            }
        }catch(NumberFormatException e){
            coffeeErrorMessage.setText("ENTER A NUMERIC VALUE!");
            btn_total.setDisable(true);
        }
    }
    
    
    public void tfCappaccinoTextControl(TextField tfCappaccino, Label coffeeErrorMessage,
                                        Button btn_total){
        try{
            if(!tfCappaccino.getText().isEmpty() ){
                if(Integer.parseInt(tfCappaccino.getText()) <= 8&&
                        Integer.parseInt(tfCappaccino.getText()) >=1 ){
                    coffeeErrorMessage.setText("");
                    btn_total.setDisable(false);
                }
                else{
                    coffeeErrorMessage.setText("COFFEE LIMIT EXCEEDED!");
                    btn_total.setDisable(true);
                }
                if(Integer.parseInt(tfCappaccino.getText()) <= 1){
                    coffeeErrorMessage.setText("ENTER THE QUANTITY");
                    btn_total.setDisable(true);
                }
            }
        }catch(NumberFormatException e){
            coffeeErrorMessage.setText("ENTER A NUMERIC VALUE!");
            btn_total.setDisable(true);
        }
    }
    public void tfCafeTextControl(TextField tfCafe , Label coffeeErrorMessage,
                                  Button btn_total){
        try{
            if(!tfCafe.getText().isEmpty() ){
                if(Integer.parseInt(tfCafe.getText()) <= 8&&
                        Integer.parseInt(tfCafe.getText()) >=1 ){
                    coffeeErrorMessage.setText("");
                    btn_total.setDisable(false);
                }
                else{
                    coffeeErrorMessage.setText("COFFEE LIMIT EXCEEDED!");
                    btn_total.setDisable(true);
                }
                if(Integer.parseInt(tfCafe.getText()) <= 1){
                    coffeeErrorMessage.setText("ENTER THE QUANTITY");
                    btn_total.setDisable(true);
                }
            }
        }catch(NumberFormatException e){
            coffeeErrorMessage.setText("ENTER A NUMERIC VALUE!");
            btn_total.setDisable(true);
            
        }
    }
}
