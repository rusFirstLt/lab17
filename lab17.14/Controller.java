package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

//По лабораторной №14

public class Controller {
    @FXML
    private Button res;
    @FXML
    private Button cal;
    @FXML
    private TextField a;
    @FXML
    private TextField b;
    @FXML
    private Label sum;

    Double aDouble, bDouble, z;

   /* Double aDouble = new Double(String.valueOf(a));
    Double bDouble = new Double(String.valueOf(b));*/

    @FXML
    private void clickCal(ActionEvent event) {
        Double aDouble = Double.parseDouble(a.getText());
        Double bDouble = Double.parseDouble(b.getText());
        z = aDouble + bDouble;
        sum.setText(String.valueOf(z));
    }

    @FXML
    public void clickRes(ActionEvent event) {
        a.setText("");
        b.setText("");
        sum.setText("");
    }
}