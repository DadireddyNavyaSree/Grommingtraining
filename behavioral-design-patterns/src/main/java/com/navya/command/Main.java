package com.navya.command;


    public class Main {
        public static void main(String[] args) {
            Tv tv = new Tv();
            TurnOnCommand turnOnCommand = new TurnOnCommand(tv);
            TurnOffCommand turnOffCommand = new TurnOffCommand(tv);
            ChangeChannelCommand changeChannelCommand = new ChangeChannelCommand(tv, 5);
            RemoteControl remoteControl = new RemoteControl(turnOnCommand, turnOffCommand, changeChannelCommand);

            remoteControl.turnOn();
            remoteControl.changeChannel(7);
            remoteControl.turnOff();
        }
    }

