package com.github.luizredig.desing_patterns_semestral.strategy;

public class Package {
    private double weight;
    private double dimensions;
    private boolean international;
    private String location;
    private String carrier;

    public Package(double weight, double dimensions, boolean international, String location, String carrier) {
        this.weight = weight;
        this.dimensions = dimensions;
        this.international = international;
        this.location = location;
        this.carrier = carrier;
    }

    public double getWeight() {
        return weight;
    }

    public double getDimensions() {
        return dimensions;
    }

    public boolean isInternational() {
        return international;
    }

    public String getLocation() {
        return location;
    }

    public String getCarrier() {
        return carrier;
    }
}
