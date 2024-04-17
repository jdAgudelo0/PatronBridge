package org.example;

// Concrete Electronic Device: Radio
public class Radio implements ElectronicDevice {
    private boolean poweredOn = false; // Flag to indicate whether the radio is powered on
    private int frequency = 100; // Current frequency of the radio

    // Method to turn on the radio
    @Override
    public void turnOn() {
        System.out.println("Turning on the radio");
        poweredOn = true;
    }

    // Method to turn off the radio
    @Override
    public void turnOff() {
        System.out.println("Turning off the radio");
        poweredOn = false;
    }

    // Method to adjust the frequency/channel of the radio
    @Override
    public void adjustChannel(int channel) {
        if (poweredOn) {
            this.frequency = channel;
            System.out.println("Changing frequency to " + channel);
        } else {
            System.out.println("Cannot adjust frequency, the radio is off");
        }
    }
}