package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create electronic devices
        ElectronicDevice television = new Television();
        ElectronicDevice dvdPlayer = new DVDPlayer();
        ElectronicDevice radio = new Radio();

        // Create remote controls
        RemoteControl tvRemoteControl = new BasicRemoteControl(television);
        RemoteControl dvdRemoteControl = new BasicRemoteControl(dvdPlayer);
        RemoteControl radioRemoteControl = new BasicRemoteControl(radio);

            // Use the remote controls
        tvRemoteControl.turnOn();
        tvRemoteControl.adjustChannel(5);
        tvRemoteControl.turnOff();

        dvdRemoteControl.turnOn();
        dvdRemoteControl.turnOff();

        radioRemoteControl.turnOn();
        radioRemoteControl.adjustChannel(95);
        radioRemoteControl.turnOff();
    }
}