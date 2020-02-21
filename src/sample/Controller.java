package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    Float data = 0f;
    int opertation = -1;
    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button zero;

    @FXML
    private Button brutto;

    @FXML
    private Button netto;

    @FXML
    private Button clear;

    @FXML
    private TextField textField;


    @FXML
    void handleButtonAction(ActionEvent event) throws MalformedURLException {

        if (event.getSource() == one) {
            textField.setText(textField.getText() + "1");
        } else if (event.getSource() == two) {
            textField.setText(textField.getText() + "2");
        } else if (event.getSource() == three) {
            textField.setText(textField.getText() + "3");
        } else if (event.getSource() == four) {
            textField.setText(textField.getText() + "4");
        } else if (event.getSource() == five) {
            textField.setText(textField.getText() + "5");
        } else if (event.getSource() == six) {
            textField.setText(textField.getText() + "6");
        } else if (event.getSource() == seven) {
            textField.setText(textField.getText() + "7");
        } else if (event.getSource() == eight) {
            textField.setText(textField.getText() + "8");
        } else if (event.getSource() == nine) {
            textField.setText(textField.getText() + "9");
        } else if (event.getSource() == zero) {
            textField.setText(textField.getText() + "0");
        } else if (event.getSource() == clear) {
            textField.setText("");
        } else if (event.getSource() == brutto) {
            data = Float.parseFloat(textField.getText());
            opertation = 1;
            textField.setText("");
            textField.setText(String.valueOf(data * 1.23));
            double vatBrutto5 = data * 0.05;
            double vatBrutto8 = data * 0.08;
            double vatBrutto23 = data * 0.23;
            Alert alertBrutto = new Alert(Alert.AlertType.INFORMATION);
            alertBrutto.setTitle("Informacje o wypłacie w Brutto");
            alertBrutto.setHeaderText("Kwota w Brutto: " + data * 1.23);
            alertBrutto.setContentText(
                    "Podana kwota Netto: " + data + "zł" + "\n" +
                            "Kwota VAT 23% : " + vatBrutto23 + "zł" + "\n" +
                            "Kwota VAT 8% : " + vatBrutto8 + "zł" + "\n" +
                            "Kwota VAT 5% : " + vatBrutto5 + "zł"
            );
            alertBrutto.showAndWait();
        } else if (event.getSource() == netto) {
            data = Float.parseFloat(textField.getText());
            opertation = 2;
            textField.setText("");
            textField.setText(String.valueOf(data / 1.23));


            Alert alertNetto = new Alert(Alert.AlertType.INFORMATION);
            alertNetto.setTitle("Informacje o wypłacie w Netto");
            alertNetto.setHeaderText("Podana kwota w Netto: " + data / 1.23);
            alertNetto.setContentText(
                    "Podana kwota Brutto : " + data + "zł"
            );
            alertNetto.showAndWait();
        }


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
