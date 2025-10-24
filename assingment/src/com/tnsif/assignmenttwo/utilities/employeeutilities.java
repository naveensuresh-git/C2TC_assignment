
package com.tnsif.assignmenttwo.utilities;
import com.tnsif.assignmenttwo.employees.*;
public class employeeutilities {

    public void giveRaise(employee emp, double amount) {
        double newSalary = emp.getSalary() + amount;
        emp.setSalary(newSalary);
        System.out.println(emp.getName() + " received a raise. New Salary: " + emp.getSalary());
    }

    public void printEmployeeInfo(employee emp) {
        emp.displayDetails();
    }
}
