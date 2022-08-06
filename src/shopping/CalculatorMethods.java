/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping;

import java.awt.Checkbox;
import static java.lang.Double.parseDouble;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 *
 * @author rajat
 */
public class CalculatorMethods {
    public double bagelCostCalulator(RadioButton radioWhite,RadioButton radioWholeWheat,
                                   TextField tfWhite,TextField tfWholeWheat){
        double bagelCost =0.0;
        if(radioWhite.isSelected()){
            
            if(!tfWhite.getText().equals("")){
                tfWhite.setDisable(false);
                bagelCost += (1.25 * parseDouble(tfWhite.getText())); 
                System.out.println(bagelCost);
            }
        }
        if(radioWholeWheat.isSelected()){
            tfWhite.setDisable(false);
            if(!tfWholeWheat.getText().equals("")){
                bagelCost += (1.50 * parseDouble(tfWholeWheat.getText()));
                System.out.println(bagelCost);
            }
        
        }return bagelCost;
    }
    
    public double toppingCostCalculator(CheckBox checkCream, CheckBox checkRaso,
                                         CheckBox checkBlue, CheckBox checkButter,
                                        CheckBox checkPeach, TextField tfWhite,
                                        TextField tfWholeWheat){
        double toppingCost=0.0;
        if(checkCream.isSelected()){
            toppingCost += Double.parseDouble(tfWhite.getText())* 0.50;
            toppingCost += Double.parseDouble(tfWholeWheat.getText())* 0.50;
            }
        if(checkButter.isSelected()){
            toppingCost += Double.parseDouble(tfWhite.getText())* 0.25;
            toppingCost += Double.parseDouble(tfWholeWheat.getText())* 0.25;
        }
        if(checkBlue.isSelected()){
           toppingCost += Double.parseDouble(tfWhite.getText())* 0.75;
            toppingCost += Double.parseDouble(tfWholeWheat.getText())* 0.75;
        }
        if(checkRaso.isSelected()){
            toppingCost += Double.parseDouble(tfWhite.getText())* 0.75;
            toppingCost += Double.parseDouble(tfWholeWheat.getText())* 0.75;
        }
        if(checkPeach.isSelected()){
            toppingCost += Double.parseDouble(tfWhite.getText())* 0.75;
            toppingCost += Double.parseDouble(tfWholeWheat.getText())* 0.75;
        }
        
    
        return toppingCost;
    }
    
    public double coffeeCostCalculator(RadioButton radioCappacciano,RadioButton radioNoneCoffee,
                                       RadioButton radioCafe,RadioButton radioRegular,
                                       TextField tfRegular, TextField tfCafe,
                                       TextField tfCappaccino){
               
        double coffeeCost = 0.0;
        
        if(!radioNoneCoffee.isSelected()){
            if(radioRegular.isSelected() ){
                if(!tfRegular.getText().equals("") )
                    coffeeCost += 1.25 * parseDouble(tfRegular.getText());
                }
            else if(radioCappacciano.isSelected()){
                if(!tfCappaccino.getText().equals("")){
                    coffeeCost += 2.00 * parseDouble(tfCappaccino.getText());}
            }
            else if(radioCafe.isSelected()){
                if(!tfCafe.getText().equals("")){
                    coffeeCost += 1.75 * parseDouble(tfCafe.getText());}
            }
        }return coffeeCost;
    }
}
