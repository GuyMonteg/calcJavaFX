package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {
    private Float data = 0f;
    private int operation = -1;

    @FXML
    private Button nine;

    @FXML
    private Button minus;

    @FXML
    private Button divide;

    @FXML
    private Button six;

    @FXML
    private Button one;

    @FXML
    private Button tree;

    @FXML
    private Button seven;

    @FXML
    private Button clear;

    @FXML
    private Button two;

    @FXML
    private Button eight;

    @FXML
    private Button multiply;

    @FXML
    private Button plus;

    @FXML
    private Button point;

    @FXML
    private Button zero;

    @FXML
    private Button four;

    @FXML
    private Button back;

    @FXML
    private Button equal;

    @FXML
    private Button five;

    @FXML
    private Label result;

    @FXML
    void buttonPressed(ActionEvent event) {
        if (event.getSource() == one) {
            result.setText(result.getText() + "1");
        }
        if (event.getSource() == two) {
            result.setText(result.getText() + "2");
        }
        if (event.getSource() == tree) {
            result.setText(result.getText() + "3");
        }
        if (event.getSource() == four) {
            result.setText(result.getText() + "4");
        }
        if (event.getSource() == five) {
            result.setText(result.getText() + "5");
        }
        if (event.getSource() == six) {
            result.setText(result.getText() + "6");
        }
        if (event.getSource() == seven) {
            result.setText(result.getText() + "7");
        }
        if (event.getSource() == eight) {
            result.setText(result.getText() + "8");
        }
        if (event.getSource() == nine) {
            result.setText(result.getText() + "9");
        }
        if (event.getSource() == zero) {
            result.setText(result.getText() + "0");
        }
        if (event.getSource() == point) {
            if (!(result.getText().contains(".")))
                result.setText(result.getText() + ".");
        }
        if (event.getSource() == plus) {
            data = Float.parseFloat(result.getText());
            operation = 1;
            result.setText("");
        }
        if (event.getSource() == minus) {
            if (result.getText().isEmpty()) {
                result.setText("-");
            } else {
                data = Float.parseFloat(result.getText());
                operation = 2;
                result.setText("");
            }
        }
        if (event.getSource() == multiply) {
            data = Float.parseFloat(result.getText());
            operation = 3;
            result.setText("");
        }
        if (event.getSource() == divide) {
            data = Float.parseFloat(result.getText());
            operation = 4;
            result.setText("");
        }
        if (event.getSource() == back) {
            result.setText(result.getText().substring(0, result.getText().length()-1));
        }
        if (event.getSource() == clear) {
            result.setText("");
        }
        if (event.getSource() == equal) {
            Float secondOperand = Float.parseFloat(result.getText());
            switch (operation) {
                case 1:
                    Float sum = data + secondOperand;
                    result.setText(String.valueOf(sum));
                    break;
                case 2:
                    sum = data - secondOperand;
                    result.setText(String.valueOf(sum));
                    break;
                case 3:
                    sum = data * secondOperand;
                    result.setText(String.valueOf(sum));
                    break;
                case 4:
                    sum = 0f;
                    try {sum = data / secondOperand;
                    } catch (Exception e) {result.setText("Error!");}
                    result.setText(String.valueOf(sum));
                    break;
            }
        }
    }

    public void labelT(MouseEvent event) {
        //((Label)event.getSource()).setText("");

    }
}
