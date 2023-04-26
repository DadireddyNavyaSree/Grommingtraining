package com.navya.chainofresponsibility;

public class LowPriorityHandler extends HelpDeskHandler {
    protected boolean canHandle(HelpDeskTicket ticket) {
        return ticket.getPriority() == Priority.LOW;
    }

    protected void handle(HelpDeskTicket ticket) {
        System.out.println("Low priority ticket handled: " + ticket.getDescription());
    }
}


