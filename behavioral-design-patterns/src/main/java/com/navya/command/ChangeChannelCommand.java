package com.navya.command;

public class ChangeChannelCommand implements Command {
    private Tv tv;
    private int channel;

    public ChangeChannelCommand(Tv tv, int channel) {
        this.tv = tv;
        this.channel = channel;
    }

    public void execute() {
        tv.changeChannel(channel);
    }
}
