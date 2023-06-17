package Class17;

public class Laptop {
    String make;
    String model;
    double batteryLife;
    int storage;
    boolean camera;
    boolean touchPad;
    boolean touchScreen;


    public Laptop(String make, String model, double batteryLife, int storage, boolean camera, boolean touchPad, boolean touchScreen) {
        this.make = make;
        this.model = model;
        this.batteryLife = batteryLife;
        this.storage = storage;
        this.camera = camera;
        this.touchPad = touchPad;
        this.touchScreen = touchScreen;
    }
    public Laptop(String make, String model, double batteryLife, int storage, boolean camera) {
        this.make = make;
        this.model = model;
        this.batteryLife = batteryLife;
        this.storage = storage;
        this.camera = camera;

    }// because you have 2 constructors you can skip using all of the parameters of both

    public static void main(String[] args) {
        Laptop dellg5=new Laptop("Dell","G5", 3, 512, true);

        String str= new String();
        new String("str");
        new String(new char[]{'c'});
        new String(new char[]{'c'},10,20);
    }
}
