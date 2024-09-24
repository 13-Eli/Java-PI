package com.generation;

public class SalesRep extends Employee {
    double salesMade;

    public SalesRep(String firstName, String lastName, int age, String role, double salary, double salesMade) {
        super(firstName, lastName, age, role, salary);
        this.salesMade = salesMade;
    }

    @Override
    public void calculateCommission() {
        double commission = 0.1 * salesMade;
        System.out.println("Commission: " + commission);
    }
}
