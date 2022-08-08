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
    static Product bagelType = new Product();
    static Product toppingCream = new Product();
    static Product toppingButter = new Product();
    static Product toppingRaspberry = new Product();
    static Product toppingBlueberry = new Product();
    static Product toppingPeach = new Product();
    static Product coffeeType = new Product();

    
    public double bagelCostCalulator(RadioButton radioWhite,RadioButton radioWholeWheat,
                                   TextField tfWhite,TextField tfWholeWheat){
        double bagelCost =0.0;
        if(radioWhite.isSelected()){
            
            if(!tfWhite.getText().equals("")){
                tfWhite.setDisable(false);
                bagelType = new Product("White",Integer.parseInt(tfWhite.getText()),1.25);
                System.out.println(bagelType);
                bagelCost += (1.25 * parseDouble(tfWhite.getText())); 
            }
        }
        if(radioWholeWheat.isSelected()){
            
            if(!tfWholeWheat.getText().equals("")){
                tfWholeWheat.setDisable(false);
                
                bagelCost += (1.50 * parseDouble(tfWholeWheat.getText()));
                bagelType = new Product("Whole Wheat",Integer.parseInt(tfWholeWheat.getText()),1.50);

            }
        
        }return bagelCost;
    }
    
    public double toppingCostCalculator(RadioButton radioWhite , RadioButton radioWholeWheat,
                                        CheckBox checkCream, CheckBox checkRaso,
                                        CheckBox checkBlue, CheckBox checkButter,
                                        CheckBox checkPeach, TextField tfWhite,
                                        TextField tfWholeWheat){
        double toppingCost=0.0;
        if(checkCream.isSelected()){
            if(radioWhite.isSelected()){
                 toppingCost += Double.parseDouble(tfWhite.getText())* 0.50;
                 toppingCream = new Product("Cream", Integer.parseInt(tfWhite.getText()), 0.25 );
            }
            if(radioWholeWheat.isSelected()){
                toppingCost += Double.parseDouble(tfWholeWheat.getText())* 0.50;
                toppingCream = new Product("Cream", Integer.parseInt(tfWholeWheat.getText()), 0.25 );
            }
            
        }
        if(checkButter.isSelected()){
            if(radioWhite.isSelected()){
                toppingCost += Double.parseDouble(tfWhite.getText())* 0.50;
                toppingButter = new Product("Butter", Integer.parseInt(tfWhite.getText()), 0.50 );
            }
            if(radioWholeWheat.isSelected()){
                toppingCost += Double.parseDouble(tfWholeWheat.getText())* 0.50;
                toppingButter = new Product("Butter", Integer.parseInt(tfWholeWheat.getText()), 0.50 );
            }
        }
        if(checkBlue.isSelected()){
            if(radioWhite.isSelected()){
                toppingCost += Double.parseDouble(tfWhite.getText())* 0.75;
                toppingBlueberry = new Product("Blue Berry" , Integer.parseInt(tfWhite.getText()) , 0.75);
            }
            if(radioWholeWheat.isSelected()){
                toppingCost += Double.parseDouble(tfWholeWheat.getText())* 0.75;
                toppingBlueberry = new Product("Blue Berry" , Integer.parseInt(tfWholeWheat.getText()) , 0.75);
            }
            
        }
        if(checkRaso.isSelected()){
            if(radioWhite.isSelected()){
                toppingCost += Double.parseDouble(tfWhite.getText())* 0.75;
                toppingRaspberry = new Product("Rasp Berry" , Integer.parseInt(tfWhite.getText()) , 0.75);
            }
            if(radioWholeWheat.isSelected()){
                toppingCost += Double.parseDouble(tfWholeWheat.getText())* 0.75;
                toppingBlueberry = new Product("Rasp Berry" , Integer.parseInt(tfWholeWheat.getText()) , 0.75);
            }
            
        }
        if(checkPeach.isSelected()){
            if(radioWhite.isSelected()){
                toppingCost += Double.parseDouble(tfWhite.getText())* 0.75;
                toppingPeach = new Product("Peach" , Integer.parseInt(tfWhite.getText()) , 0.75);
            }
            if(radioWholeWheat.isSelected()){
                toppingCost += Double.parseDouble(tfWholeWheat.getText())* 0.75;
                toppingBlueberry = new Product("Peach" , Integer.parseInt(tfWholeWheat.getText()) , 0.75);
            }
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
                    coffeeType = new Product("Regular Coffee" , Integer.parseInt(tfRegular.getText()),1.25);
                    
                }
            if(radioCappacciano.isSelected()){
                if(!tfCappaccino.getText().equals("")){
                    coffeeCost += 2.00 * parseDouble(tfCappaccino.getText());
                    coffeeType = new Product("Cappaccino Coffee" , Integer.parseInt(tfCappaccino.getText()),2.00);
                }
            }
            if(radioCafe.isSelected()){
                if(!tfCafe.getText().equals("")){
                    coffeeCost += 1.75 * parseDouble(tfCafe.getText());
                    coffeeType = new Product("Cafe Au Lait Coffee" , Integer.parseInt(tfCafe.getText()),1.75);
                }
            }
        }return coffeeCost;
    }
}
