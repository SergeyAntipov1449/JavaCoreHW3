package org.example;

public class Worker extends Employee {
    private float monthlySalary;

    public Worker(String firstName, String lastName, long idNumber, float monthlySalary) {
        super(firstName, lastName, idNumber);
        this.monthlySalary = monthlySalary;
    }

    public float getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(float monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    float calculateSalary(float monthlySalary) {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + "salary: " + monthlySalary;
    }
}
