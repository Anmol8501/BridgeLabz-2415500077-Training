package Functional_Interface.Smart_Device_Control_Interface;

public class LightsImpl implements ISmartDevices {
    @Override
    public void turnOn() {
        System.out.println("Lights are turned ON");
    }
    
    @Override
    public void turnOff() {
        System.out.println("Lights are turned OFF");
    }

}
