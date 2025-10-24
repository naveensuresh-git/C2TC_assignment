package com.tnsif.assignmenttwo.utilities;

import com.tnsif.assignmenttwo.employees.*; // only this import is needed

public class  {
    public static void main(String[] args) {
        Manager m1 = new Manager("Alice", 101, 80000, "IT", 5000);
        Developer d1 = new Developer("Bob", 102, 60000, "Java", "Banking System");

        EmployeeUtilities util = new EmployeeUtilities();

        System.out.println("---- Before Raise ----");
        util.printEmployeeInfo(m1);
        util.printEmployeeInfo(d1);

        System.out.println("\n---- After Raise ----");
        util.giveRaise(m1, 5000);
        util.giveRaise(d1, 3000);

        util.printEmployeeInfo(m1);
        util.printEmployeeInfo(d1);
    }
}
