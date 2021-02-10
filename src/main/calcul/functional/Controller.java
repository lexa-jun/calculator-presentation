package calcul.functional;


import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller implements functional {

    public TextField display;

    public buttonDigit btn;

    public Controller() {
        btn = new buttonDigit(this);
    }

    public void setDigit(String s) {
        display.setText(s);
    }

    public String getDigit() {
        return display.getText();
    }

    @Override
    public void buttonDigitClick(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        String digit = button.getText();
        btn.digit(digit);
    }

    @Override
    public void buttonOperatorClick(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        String operator = button.getText();
        btn.operator(operator);
    }

    @Override
    public void buttonCleanClick(ActionEvent actionEvent) {
        btn.clean();
    }

    @Override
    public void buttonCommaClick(ActionEvent actionEvent) {
        btn.comma();
    }

    @Override
    public void buttonNegativeClick(ActionEvent actionEvent) {
        btn.negative();
    }

    @Override
    public void buttonEnterClick(ActionEvent actionEvent) {
        btn.enter();
    }
}