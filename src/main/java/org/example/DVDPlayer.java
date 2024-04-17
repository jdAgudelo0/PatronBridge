package org.example;

// Concrete Electronic Device: DVD Player
public class DVDPlayer implements ElectronicDevice {
    private boolean poweredOn = false; // Flag to indicate whether the DVD player is powered on

    // Method to turn on the DVD player
    @Override
    public void turnOn() {
        System.out.println("Turning on the DVD player");
        poweredOn = true;
    }

    // Method to turn off the DVD player
    @Override
    public void turnOff() {
        System.out.println("Turning off the DVD player");
        poweredOn = false;
    }

    // Method to adjust the channel (not applicable for DVD player)
    @Override
    public void adjustChannel(int channel) {
        System.out.println("The DVD player does not have channel adjustment function");
    }
}