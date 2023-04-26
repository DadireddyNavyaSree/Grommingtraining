package com.navya.chainofresponsibility;

public abstract class HelpDeskHandler {
    private HelpDeskHandler successor;

    public void setSuccessor(HelpDeskHandler successor) {
        this.successor = successor;
    }

    public void handleTicket(HelpDeskTicket ticket) {
        if (canHandle(ticket)) {
            handle(ticket);
        } else if (successor != null) {
            successor.handleTicket(ticket);
        } else {
            System.out.println("No handler found for ticket: " + ticket.getDescription());
        }
    }
    protected abstract boolean canHandle(HelpDeskTicket ticket);
    protected abstract void handle(HelpDeskTicket ticket);
}
