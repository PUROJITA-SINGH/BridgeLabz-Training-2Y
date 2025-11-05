interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light turned ON"); }
    public void turnOff() { System.out.println("Light turned OFF"); }
}

class AC implements SmartDevice {
    public void turnOn() { System.out.println("AC turned ON"); }
    public void turnOff() { System.out.println("AC turned OFF"); }
}

public class SmartDeviceDemo {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        light.turnOn();
        ac.turnOff();
    }
}
