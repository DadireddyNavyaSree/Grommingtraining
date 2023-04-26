package com.navya.command;

public class RemoteControl {
    private Command turnOnCommand;
    private Command turnOffCommand;
    private Command changeChannelCommand;

    public RemoteControl(Command turnOnCommand, Command turnOffCommand, Command changeChannelCommand) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
        this.changeChannelCommand = changeChannelCommand;
    }

    public void turnOn() {
        turnOnCommand.execute();
    }

    public void turnOff() {
        turnOffCommand.execute();
    }

    public void changeChannel(int channel) {
        changeChannelCommand.execute();
    }
}


