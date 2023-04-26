package com.navya.adapter;

// class adapter , work as two-way adapetr

public class EmployeeClassAdapter extends Employee implements Customer {


    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.getOfficeLocation();
    }
}
