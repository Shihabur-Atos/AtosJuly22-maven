package com.qa.app.polymorphism;

import java.util.ArrayList;

public class Garage {
    ArrayList<Vehicle> vehicles = new ArrayList<>(); //5

    public void calculateBill() {
        for (Vehicle v: vehicles) {
            if(v.getMake().equals("Van")) {
                System.out.println("Type: Van" + ", costs £1500 to fix");
            } else if(v.getMake().equals("Car")) {
                System.out.println("Type: Car" + ", costs £500 to fix");
            } else if(v.getMake().equals("Moped")) {
                System.out.println("Type: Moped" + ", costs £700 to fix");
            }
        }

    }

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public void removeVehicle(Vehicle v) {
        vehicles.remove(v);
    }

    public void removeVehicleType(String type) {
        for(Vehicle vehicle : vehicles) {
            if(vehicle.getMake().equals(type)) {
                vehicles.remove(vehicle);
            }
        }
    }

    public void fixVehicle(Vehicle v) {
        if(v.getMake().equals("Van")) {
            System.out.println("Type: Van" + ", costs £1500 to fix");
        } else if(v.getMake().equals("Car")) {
            System.out.println("Type: Car" + ", costs £500 to fix");
        } else if(v.getMake().equals("Moped")) {
            System.out.println("Type: Moped" + ", costs £700 to fix");
        }
    }

    public void emptyGarage() {
        vehicles.clear();
    }



}

