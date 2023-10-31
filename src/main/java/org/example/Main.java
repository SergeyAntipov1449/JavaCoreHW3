package org.example;

import org.example.comparators.IdComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List staff = new ArrayList<Employee>();
        Employee e1 = new Worker("Kimberly", "Hawkins", 15, 50000);
        Employee e2 = new Worker("Dolores", "Shaw", 47, 45000);
        Employee e3 = new Worker("Paul", "Long", 2, 51000);
        Employee e4 = new Worker("Robert", "Crawford", 477, 30000);
        Employee e5 = new Freelancer("Micheal", "Carr", 91, 250);
        Employee e6 = new Freelancer("Rosemary", "Brown", 11, 300);
        Employee e7 = new Freelancer("Vincent", "Tran", 972, 280);
        Employee e8 = new Freelancer("Jose", "Hernandez", 1, 310);

        staff.add(e1);
        staff.add(e2);
        staff.add(e3);
        staff.add(e4);
        staff.add(e5);
        staff.add(e6);
        staff.add(e7);
        staff.add(e8);

        Comparator comp = new IdComparator();
        Comparator revComp = new IdComparator().reversed();

        staff.sort(comp);
        System.out.println("staff = " + staff);
        System.out.println(" ======================================================= ");

        staff.sort(revComp);
        System.out.println("staff = " + staff);
        System.out.println(" ======================================================= ");

        for (Object employee : staff) {
            System.out.println(employee.toString());
        }


    }
}