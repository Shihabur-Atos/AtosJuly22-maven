package com.qa.app.polymorphism;

public class Van extends Vehicle {

    private boolean hasCableConnector;
    private String fuelType;
    private int weight;

    public Van() {
        this.make = "Van";
    }

    @Override
    public int topSpeed() {
        return 180;
    }

    public boolean isHasCableConnector() {
        return hasCableConnector;
    }

    public void setHasCableConnector(boolean hasCableConnector) {
        this.hasCableConnector = hasCableConnector;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

