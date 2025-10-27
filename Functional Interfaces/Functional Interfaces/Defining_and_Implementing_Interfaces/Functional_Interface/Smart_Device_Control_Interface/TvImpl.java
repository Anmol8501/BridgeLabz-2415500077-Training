package Functional_Interface.Smart_Device_Control_Interface;

public class TvImpl implements ISmartDevices {
    @Override
    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF");
    }
    
}
