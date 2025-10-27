package Functional_Interface.Smart_Device_Control_Interface;

public class Main {
    public static void main(String[] args) {
        ISmartDevices tv = new TvImpl();
        ISmartDevices ac = new AcImpl();
        ISmartDevices lights = new LightsImpl();

        tv.turnOn();
        ac.turnOn();
        lights.turnOn();

        tv.turnOff();
        ac.turnOff();
        lights.turnOff();
    }
}
