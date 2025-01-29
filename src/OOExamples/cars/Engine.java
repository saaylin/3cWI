package OOExamples.cars;



public class Engine {
    public enum Type { DIESEL, GASOLINE }

    private int horsepower;
    private Type type;

    public Engine(int horsepower, Type type) {
        this.horsepower = horsepower;
        this.type = type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public Type getType() {
        return type;
    }
}



