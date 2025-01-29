package OOExamples.cars;

public class Truck extends Car{
    private String trailer;

    public Truck(Engine engine, String brand, String color, String trailer) {
        super(engine, brand, color);
        this.trailer - trailer;
    }
    public String getTraler(){
        return trailer;
    }
}
