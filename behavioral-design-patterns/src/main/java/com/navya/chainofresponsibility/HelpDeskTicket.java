package com.navya.chainofresponsibility;

public class HelpDeskTicket {
    private String description;
    private Priority priority;

    public HelpDeskTicket(String description, Priority priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }
}
