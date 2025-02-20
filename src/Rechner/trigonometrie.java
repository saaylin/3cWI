package Rechner;

public class trigonometrie extends Calculator {
    public double sin (double angle){
        return Math.sin(Math.toRadians(angle));
    }

    public double cos(double angle){
        return Math.cos(Math.toRadians(angle));
    }
}
