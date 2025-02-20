package Rechner;

public class wurzel extends Calculator {
    public double sqrt(double value){
        if (value < 0) {
            throw new ArithmeticException("Error");
        }
        return Math.sqrt(value);
    }
}
