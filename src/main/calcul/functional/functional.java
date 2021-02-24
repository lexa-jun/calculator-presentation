package calcul.functional;


import javafx.event.ActionEvent;

interface functional {

    void buttonDigitClick(ActionEvent actionEvent);

    String getDigit();

    void buttonCleanClick(ActionEvent actionEvent);

    void buttonCommaClick(ActionEvent actionEvent);

    void buttonNegativeClick(ActionEvent actionEvent);

    void buttonOperatorClick(ActionEvent actionEvent);

    void buttonEnterClick(ActionEvent actionEvent);

    void setDigit(String valueOf);
}


