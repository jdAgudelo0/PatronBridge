package org.example;

public abstract class RemoteControl {
    protected ElectronicDevice device; // Reference to the electronic device controlled by this remote control

    // Constructor to initialize the device
    public RemoteControl(ElectronicDevice device) {
        this.device = device;
    }

    // Abstract methods to be implemented by concrete remote controls
    public abstract void turnOn(); // Turn on the device
    public abstract void turnOff(); // Turn off the device
    public abstract void adjustChannel(int channel); // Adjust the channel of the device
}