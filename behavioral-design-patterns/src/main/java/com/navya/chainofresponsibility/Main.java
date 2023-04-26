package com.navya.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        HelpDeskHandler lowHandler = new LowPriorityHandler();
        HelpDeskHandler mediumHandler = new MediumPriorityHandler();
        HelpDeskHandler highHandler = new HighPriorityHandler();

        lowHandler.setSuccessor(mediumHandler);
        mediumHandler.setSuccessor(highHandler);

        HelpDeskTicket ticket1 = new HelpDeskTicket("Printer not working", Priority.LOW);
        HelpDeskTicket ticket2 = new HelpDeskTicket("Network connection lost", Priority.MEDIUM);
        HelpDeskTicket ticket3 = new HelpDeskTicket("Server crashed", Priority.HIGH);

        lowHandler.handleTicket(ticket1);
        lowHandler.handleTicket(ticket2);
        lowHandler.handleTicket(ticket3);
    }
}
