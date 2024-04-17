package org.example;

// Concrete Electronic Device: Television
public class Television implements ElectronicDevice {
    private boolean poweredOn = false; // Flag to indicate whether the television is powered on
    private int channel = 1; // Current channel of the television

    // Method to turn on the television
    @Override
    public void turnOn() {
        System.out.println("Turning on the television");
        poweredOn = true;
    }

    // Method to turn off the television
    @Override
    public void turnOff() {
        System.out.println("Turning off the television");
        poweredOn = false;
    }

    // Method to adjust the channel of the television
    @Override
    public void adjustChannel(int channel) {
        if (poweredOn) {
            this.channel = channel;
            System.out.println("Changing channel to " + channel);
        } else {
            System.out.println("Cannot adjust channel, the television is off");
        }
    }
}