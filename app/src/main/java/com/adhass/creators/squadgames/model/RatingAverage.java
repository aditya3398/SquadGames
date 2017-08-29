package com.adhass.creators.squadgames.model;

import org.simpleframework.xml.Attribute;

public class RatingAverage {
    @Attribute(name = "value")
    private double value;

    public RatingAverage(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
