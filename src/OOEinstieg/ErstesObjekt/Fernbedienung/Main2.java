package OOEinstieg.ErstesObjekt.Fernbedienung;

public class Main2 {
    public static void main(String[] args) {
        Fernbedienung remoteControl = new Fernbedienung(100, 100);

        System.out.println("Ladestatus:" + remoteControl.getStatus() + "%");

        remoteControl.turnOn();
        System.out.println("Ladestatus Eingeschalten:" +remoteControl.getStatus() +"%");
        remoteControl.turnOff();
        System.out.println("Ladestatus Ausgeschalten:" + remoteControl.getStatus() +"%");

    }
}
