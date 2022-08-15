package com.qa.app.polymorphism;

public class Moped extends Vehicle {
    String make;
    String style;
    boolean customised;

    public Moped() {
        this.make = "Moped";
    }

    @Override
    public int topSpeed() {
        return 180;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public boolean isCustomised() {
        return customised;
    }

    public void setCustomised(boolean customised) {
        this.customised = customised;
    }
}

