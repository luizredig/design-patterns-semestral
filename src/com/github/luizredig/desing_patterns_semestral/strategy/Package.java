package com.github.luizredig.desing_patterns_semestral.strategy;

public class Package {
    private double weight;
    private double dimensions;
    private boolean international;
    private String location;
    private String localCarrier;

    public Package(double weight, double dimensions, boolean international, String location, String localCarrier) {
        this.weight = weight;
        this.dimensions = dimensions;
        this.international = international;
        this.location = location;
        this.localCarrier = localCarrier;
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

    public String getLocalCarrier() {
        return localCarrier;
    }
}
