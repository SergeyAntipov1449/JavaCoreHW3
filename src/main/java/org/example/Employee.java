package org.example;

public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected long idNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public Employee(String firstName, String lastName, long idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    abstract float calculateSalary(float income);

    @Override
    public String toString() {
        return "\n" + "name: " + firstName + "\t" + "surname: " + lastName + "\t" + "ID: " + idNumber;
    }
}
