package com.generation;

public class Main {

    public static void main(String[] args) {
        SalesRep salesRep1 = new SalesRep("John", "Doe", 30, "Sales Representative", 50000, 200000);
        SalesRep salesRep2 = new SalesRep("Jane", "Smith", 28, "Sales Representative", 55000, 250000);

        SalesManager salesManager = new SalesManager();
        salesManager.addSalesRep(salesRep1);
        salesManager.addSalesRep(salesRep2);

        System.out.println(salesManager.getSalesRep("John Doe"));
        System.out.println(salesManager.getSalesRep("Jane Smith"));

        salesRep1.calculateCommission();
        salesRep2.calculateCommission();
    }
}
