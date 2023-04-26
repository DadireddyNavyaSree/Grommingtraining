package com.navya.state;

public class Main {
    public static void main(String[] args) {
        State onState = new OnState();
        State offState = new OffState();

        Device device = new Device(onState);
        device.switchOnOff();
        device.setState(offState);
        device.switchOnOff();
    }
}
