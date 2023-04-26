package com.navya.chainofresponsibility;

public class HighPriorityHandler extends HelpDeskHandler {
    protected boolean canHandle(HelpDeskTicket ticket) {
        return ticket.getPriority() == Priority.HIGH;
    }

    protected void handle(HelpDeskTicket ticket) {
        System.out.println("High priority ticket handled: " + ticket.getDescription());
    }
}
