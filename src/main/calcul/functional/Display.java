package calcul.functional;

public  class Display {

    private boolean lastButtonWasDigit;

    private final Functional func;

    private float a = 0f;

    private float b = 0f;

    private String operator = "+";

    public Display(Functional func) {
        this.func = func;
    }

    private float getParse() {
        return Float.parseFloat(func.getDigit().replace(',','.'));
    }

    public void setDigits(float number) {
        func.setDigit(String.valueOf(number));
    }

    public void operator(String operator) {
        if (lastButtonWasDigit) {
            b = getParse();
            calc();
        }
        this.operator = operator;
    }

    void digit(String digit) {
        if (lastButtonWasDigit) {
            func.setDigit(func.getDigit() + digit);
        } else {
            func.setDigit(digit);
        }
        lastButtonWasDigit = true;
    }

    void comma() {
        if (!func.getDigit().contains(",")) {
            func.setDigit(func.getDigit() + ",");
        }
    }

    void clean() {
        lastButtonWasDigit = false;
        operator = "+";
        a = 0f;
        b = 0f;
        func.setDigit("0");
    }

    void negative() {
        float number = getParse();
        Float newNumber = number * -1.0F;
        func.setDigit(String.valueOf(newNumber));
    }

    public void enter() {
        if(lastButtonWasDigit){
            b = getParse();
        }
          calc();
    }

    private void calc() {

        switch (this.operator) {
            case "+" -> setDigits(a + b);
            case "-" -> setDigits(a - b);
            case "*" -> setDigits(a * b);
            case "/" -> setDigits(a / b);
            default -> throw new IllegalStateException("Unexpected value:" + this.operator);
        }
        a = getParse();
        lastButtonWasDigit = false;
    }
}