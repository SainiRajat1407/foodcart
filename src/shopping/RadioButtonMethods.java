/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping;

import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 *
 * @author rajat
 */
public class RadioButtonMethods {
    
    public void radioNoneClicked(RadioButton radioNone,RadioButton radioNoneCoffee,
                                 RadioButton radioRegular,RadioButton radioCappaccino,
                                 RadioButton radioCafe,TextField tfWhite,TextField tfWholeWheat,
                                 CheckBox checkCream, CheckBox checkRaso , CheckBox checkBlue,
                                 CheckBox checkButter , CheckBox checkPeach){
        if(radioNone.isSelected()){
            tfWhite.setDisable(true);
            tfWholeWheat.setDisable(true);
            tfWhite.setText("0");
            tfWholeWheat.setText("0");
            checkCream.setDisable(true);
            checkCream.setSelected(false);
            checkButter.setDisable(true);
            checkButter.setSelected(false);
            checkRaso.setDisable(true);
            checkRaso.setSelected(false);
            checkPeach.setDisable(true);
            checkPeach.setSelected(false);
            checkBlue.setDisable(true);
            checkBlue.setSelected(false);
            radioRegular.setDisable(true);
            radioCafe.setDisable(true);
            radioCappaccino.setDisable(true);
            }
    }
    
    public void radioWhiteclicked(RadioButton radioWhite,
                                  TextField tfWhite,TextField tfWholeWheat,
                                  CheckBox checkCream, CheckBox checkRaso , CheckBox checkBlue,
                                  CheckBox checkButter , CheckBox checkPeach){
        if(radioWhite.isSelected()) {
            tfWhite.setDisable(false);
            tfWholeWheat.setDisable(true);
            tfWholeWheat.setText("0");
            checkCream.setDisable(false);
            checkButter.setDisable(false);
            checkRaso.setDisable(false);
            checkPeach.setDisable(false);
            checkBlue.setDisable(false);
           
        }
    }
    
    public void radioWholeClicked(RadioButton radioWholeWheat,
                                  TextField tfWhite, TextField tfWholeWheat,
                                  CheckBox checkCream, CheckBox checkRaso , CheckBox checkBlue,
                                  CheckBox checkButter , CheckBox checkPeach){
         if(radioWholeWheat.isSelected()){
            tfWhite.setDisable(true);
            tfWholeWheat.setDisable(false);
            tfWhite.setText("0");
            
            checkCream.setDisable(false);
            checkButter.setDisable(false);
            checkRaso.setDisable(false);
            checkPeach.setDisable(false);
            checkBlue.setDisable(false);

        }
    }
    public void radioNoneCoffeClicked(RadioButton radioNoneCoffee,
                                      TextField tfRegular, TextField tfCappaccino,
                                      TextField tfCafe){
         if(radioNoneCoffee.isSelected()){
            tfRegular.setDisable(true);
            tfCappaccino.setDisable(true);
            tfCafe.setDisable(true);
            tfRegular.setText("0");
            tfCappaccino.setText("0");
            tfCafe.setText("0");
            
            }
    }
    public void buttonRegularClicked(RadioButton radioRegular,TextField tfRegular,
                                     TextField tfCappaccino, TextField tfCafe){
        if(radioRegular.isSelected()){
                tfRegular.setDisable(false);
                tfCappaccino.setDisable(true);
                tfCafe.setDisable(true);
                tfCappaccino.setText("0");
                tfCafe.setText("0");
            }
    }
    
    public void radioCappaccinoClicked(RadioButton radioCappaccino,
                                       TextField tfRegular,
                                       TextField tfCappaccino, TextField tfCafe){
        if(radioCappaccino.isSelected()){
            tfRegular.setDisable(true);
            tfCappaccino.setDisable(false);
            tfCafe.setDisable(true);
            tfCafe.setText("0");
            tfRegular.setText("0");
        }
    }
    
    public void radioCafeClicked(RadioButton radioCafe,
                                 TextField tfRegular,
                                 TextField tfCappaccino, TextField tfCafe){
        if(radioCafe.isSelected()){
            tfRegular.setDisable(true);
            tfCappaccino.setDisable(true);
            tfCafe.setDisable(false);
            tfCappaccino.setText("0");
            tfRegular.setText("0");
        }}
    
    
}
