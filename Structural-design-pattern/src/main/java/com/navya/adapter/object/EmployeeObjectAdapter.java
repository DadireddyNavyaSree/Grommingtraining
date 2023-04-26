package com.navya.adapter.object;

// An object adapter , using composition to translate interface

import com.navya.adapter.Customer;
import com.navya.adapter.Employee;
import com.navya.adapter.EmployeeClassAdapter;

public class EmployeeObjectAdapter implements Customer {

    private Employee adaptee;

    public EmployeeObjectAdapter(Employee adaptee) {

        this.adaptee = adaptee;
    }

    @Override
    public String getName() {
        return adaptee.getFullName();
    }

    @Override
    public String getDesignation() {
        return adaptee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return adaptee.getOfficeLocation();
    }
}
