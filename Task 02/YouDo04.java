class Sensor {
    String name;
    int batteryLevel;

    void charge() {
        batteryLevel = 100;
        System.out.println("Sensor fully charged");
    }

}
public class YouDo04 {
    public static void main(String[] args) {
        Sensor ob = new Sensor();
        ob.charge();
        System.out.println("New battery level : " + ob.batteryLevel);
    }
}
