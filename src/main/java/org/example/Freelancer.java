package org.example;

import java.util.Iterator;

public class Freelancer extends Employee {
    private float hourlyCharge;

    public Freelancer(String firstName, String lastName, long idNumber, float hourlyCharge) {
        super(firstName, lastName, idNumber);
        this.hourlyCharge = hourlyCharge;
    }

    public float getHourlyCharge() {
        return hourlyCharge;
    }

    public void setHourlyCharge(float hourlyCharge) {
        this.hourlyCharge = hourlyCharge;
    }

    @Override
    float calculateSalary(float hourlyCharge) {
        float monthlySalary = (float) (20.8 * 8 * hourlyCharge);
        return monthlySalary;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + "salary: " + calculateSalary(this.getHourlyCharge());
    }
}
