/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package shopping;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author rajat
 */
public class CartController  implements Initializable  {

    @FXML
    private TextField tfWhite;
    @FXML
    private TextField tfWholeWheat;
    @FXML
    private TextField tfRegular;
    @FXML
    private TextField tfCappaccino;
    @FXML
    private TextField tfCafe;
    @FXML
    private Label label_subtotal;
    @FXML
    private Label label_sales;
    @FXML
    private Label label_total;
    @FXML
    private Button btn_total;
    @FXML
    private Button btn_reset;
    @FXML
    private Button btn_exit;
    @FXML
    private CheckBox checkCream;
    @FXML
    private CheckBox checkButter;
    @FXML
    private CheckBox checkBlue;
    @FXML
    private CheckBox checkRaso;
    @FXML
    private CheckBox checkPeach;
    @FXML
    private RadioButton radioNoneCoffee;
    @FXML
    private ToggleGroup coffee;
    @FXML
    private RadioButton radioRegular;
    @FXML
    private RadioButton radioCappacciano;
    @FXML
    private RadioButton radioCafe;
    @FXML
    private RadioButton radioNone;
    @FXML
    private RadioButton radioWhite;
    @FXML
    private RadioButton radioWholeWheat;
    @FXML
    private ToggleGroup bagel;
    @FXML
    private Label label_Subtotal;
    @FXML
    private Label errorMessage;
     @FXML
    private Label coffeeErrorMessage;
    @FXML
    private AnchorPane anchorToppings;
    
    static CalculatorMethods cal = new CalculatorMethods();
    
    static RadioButtonMethods rad = new RadioButtonMethods();
    
    static TextFieldMethods ted = new TextFieldMethods();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btntotal_click(ActionEvent event)throws Exception {
        double bagelCost = bagelCost();
        double toppingCost = toppingCost();
        double coffeeCost = coffeeCost();
        double subTotal = subTotal();
        double tax = calculateTax();
        double total = calculateTotal();
        if(subTotal >=0 ){
            label_Subtotal.setText(Double.toString( subTotal ) );
        }
        if(tax >= 0){
            label_sales.setText(Double.toString(tax));
        }
        if(total >= 0 ){
            label_total.setText(Double.toString( total  ));
        }
    }

    @FXML
    private void btnreset_click(ActionEvent event) {
        tfWhite.setText("");
        tfWholeWheat.setText("");
        tfRegular.setText("");
        tfCappaccino.setText("");
        tfCafe.setText("");
        checkCream.setSelected(false);
        checkButter.setSelected(false);
        checkBlue.setSelected(false);
        checkRaso.setSelected(false);
        checkPeach.setSelected(false);
        label_Subtotal.setText("");
        label_sales.setText("");
        label_total.setText("");
    }

    @FXML
    private void btnexit_click(ActionEvent event) {
        Stage window = (Stage) btn_exit.getScene().getWindow();
        window.close();
    }

    public double bagelCost() {
        double bagelCost = cal.bagelCostCalulator(radioWhite, radioWholeWheat, tfWhite,
                                                  tfWholeWheat);
        return bagelCost;
    }
    
    /**
     * @return the toppingCost
     */
    public  double toppingCost(){
        double toppingCost = cal.toppingCostCalculator(checkCream, checkRaso, checkBlue,
                                                       checkButter, checkPeach,tfWhite,
                                                       tfWholeWheat);
       return toppingCost;
        }
    public double coffeeCost() {
        double coffeeCost = cal.coffeeCostCalculator(radioCappacciano, radioNoneCoffee,
                                                     radioCafe, radioRegular, tfRegular,
                                                     tfCafe, tfCappaccino);
        return coffeeCost;
    }
    public double subTotal(){
        double subTotal = (bagelCost()+ coffeeCost()+toppingCost());
        double subTotalValue = Math.round(subTotal*100)/100.0;
        return subTotalValue;
        }
    
    public double calculateTax(){
        double tax = (0.13) * subTotal();
        double taxValue = Math.round(tax*100)/100.0;
        return taxValue;
    }
    
    public double calculateTotal(){
        double subTotal = subTotal();
        double total = subTotal + calculateTax();
        double totalValue = Math.round(total*100)/100.0;
        return totalValue;
    }
    /*
    *Reset  functions- resetBagel , resetToppings , resetCoffee ,resetPrice
    */
    public void resetBagel(){
        tfWhite.setText("");
        tfWholeWheat.setText("");

    }
    public void resetCoffee(){
        tfRegular.setText("");
        tfCappaccino.setText("");
        tfCafe.setText("");

    }
    public void resetToppings(){
        checkCream.setSelected(false);
        checkButter.setSelected(false);
        checkRaso.setSelected(false);
        checkBlue.setSelected(false);
        checkPeach.setSelected(false);
    }
    public void resetPrice(){
        label_subtotal.setText("");
        label_sales.setText("");
        label_total.setText("");
    }
    
    @FXML
    private void radioWhiteClicked(ActionEvent event) {
        rad.radioWhiteclicked(radioWhite, tfWhite, tfWholeWheat, checkCream,
                              checkRaso, checkBlue, checkButter, checkPeach);
    }
    @FXML
    private void radioWholeClicked(ActionEvent event) {
        rad.radioWholeClicked(radioWholeWheat, tfWhite, tfWholeWheat, checkCream,
                              checkRaso, checkBlue,checkButter, checkPeach);
    }
    @FXML
    private void radioNoneClicked(ActionEvent event) {
        rad.radioNoneClicked(radioNone, radioNoneCoffee, radioRegular, radioCappacciano,
                             radioCafe, tfWhite, tfWholeWheat, checkCream, checkRaso,
                             checkBlue, checkButter, checkPeach);
        
    }

    @FXML
    private void radioNoneCoffee(ActionEvent event) {
       rad.radioNoneCoffeClicked(radioNoneCoffee, tfRegular, tfCappaccino, tfCafe);
    }

    @FXML
    private void radioRegularClicked(ActionEvent event) {
        rad.buttonRegularClicked(radioRegular, tfRegular, tfCappaccino, tfCafe);
    }

    @FXML
    private void radioCappaccinoClicked(ActionEvent event) {
        rad.radioCappaccinoClicked(radioCappacciano, tfRegular, tfCappaccino, tfCafe);

    }

    @FXML
    private void radioCafeClicked(ActionEvent event) {
        rad.radioCafeClicked(radioCafe, tfCafe, tfCappaccino, tfCafe);

    }
    
    @FXML
    private void tfWhiteAction(KeyEvent event) {
        ted.tfWhiteTextControl(tfWhite, errorMessage, radioCafe,
                               radioRegular, radioCappacciano,btn_total);
    }

    @FXML
    private void tfWholeAction(KeyEvent event) {
        ted.tfWholeTextControl(tfWholeWheat, errorMessage, radioCafe,
                               radioRegular, radioCappacciano,btn_total);
    }

    @FXML
    private void tfRegularAction(KeyEvent event) {
        ted.tfRegularTextControl(tfRegular, coffeeErrorMessage,btn_total);
    }

    @FXML
    private void tfCafeAction(KeyEvent event) {
        ted.tfCafeTextControl(tfCafe, coffeeErrorMessage,btn_total);
    }

    @FXML
    private void tfCappaccinoAction(KeyEvent event) {
        ted.tfCappaccinoTextControl(tfCappaccino, coffeeErrorMessage,btn_total);
    }
    
}
