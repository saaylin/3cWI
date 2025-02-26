package OOExamples.cars;


public class main {
    public static void main(String[] args) {
        Manufacturer bmw = new Manufacturer("BMW", "Deutschland", 12);
        Manufacturer toyota = new Manufacturer("Toyota", "Japan", 8);

        Engine dieselEngine = new Engine(150, Engine.Type.e1);
        Engine gasolineEngine = new Engine(180, Engine.Type.e2);

        Car car1 = new Car("Blau", 240, 40000, 6.5, bmw, dieselEngine);
        Car car2 = new Car("Rot", 220, 35000, 7.0, toyota, gasolineEngine);

        car1.printCarInfo();
        car2.printCarInfo();

        // Test: Auto fährt
        car1.drive(30000); // unter 50.000 km
        car1.printCarInfo();

        car1.drive(25000); // über 50.000 km Grenze
        car1.printCarInfo();

        car2.drive(60000);
        car2.printCarInfo();
    }
}

