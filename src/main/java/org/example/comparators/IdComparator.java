package org.example.comparators;

import org.example.Employee;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getIdNumber() > o2.getIdNumber()) {
            return 1;
        }
        if (o1.getIdNumber() < o2.getIdNumber()) {
            return -1;
        } else
            return 0;
    }

    @Override
    public Comparator<Employee> reversed() {
        return Comparator.super.reversed();
    }
}
