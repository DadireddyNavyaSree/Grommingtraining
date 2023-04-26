package com.navya.chainofresponsibility;

public class MediumPriorityHandler extends HelpDeskHandler {
    protected boolean canHandle(HelpDeskTicket ticket) {
        return ticket.getPriority() == Priority.MEDIUM;
    }

    protected void handle(HelpDeskTicket ticket) {
        System.out.println("Medium priority ticket handled: " + ticket.getDescription());
    }
}
