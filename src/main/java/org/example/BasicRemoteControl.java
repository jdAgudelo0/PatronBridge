package org.example;

// Refined Abstractions: Specific Remote Controls
public class BasicRemoteControl extends RemoteControl {
    // Constructor to initialize the device using the superclass constructor
    public BasicRemoteControl(ElectronicDevice device) {
        super(device);
    }

    // Override abstract methods to delegate the actions to the device
    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public void adjustChannel(int channel) {
        device.adjustChannel(channel);
    }
}