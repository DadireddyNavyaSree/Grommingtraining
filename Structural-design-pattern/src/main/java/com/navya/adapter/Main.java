package com.navya.adapter;

import com.navya.adapter.object.EmployeeObjectAdapter;

public class Main {
    public static void main(String[] args) {

        // ** using class adapter **//

        EmployeeClassAdapter adapter = new EmployeeClassAdapter();

        PopulateEmployeeData(adapter);

        BusinessCardDesigner designer = new BusinessCardDesigner();

        String card = designer.designCard(adapter);

        System.out.println(card);

        System.out.println("***************");

        // ** using object adapter **//

        Employee employee = new Employee();

        PopulateEmployeeData(employee);

        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);

        card = designer.designCard(objectAdapter);

        System.out.println(card);

    }

    private static void PopulateEmployeeData(Employee employee){
        employee.setFullName("Navyasree");
        employee.setJobTitle("software engineer");
        employee.setOfficeLocation("Banglore , India");
    }
}
