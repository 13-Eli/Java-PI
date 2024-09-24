package com.generation;

import java.util.HashMap;

public class SalesManager {
    HashMap<String, SalesRep> salesTeam = new HashMap<>();

    public void addSalesRep(SalesRep salesRep) {
        salesTeam.put(salesRep.firstName + " " + salesRep.lastName, salesRep);
    }

    public SalesRep getSalesRep(String name) {
        return salesTeam.get(name);
    }
}
