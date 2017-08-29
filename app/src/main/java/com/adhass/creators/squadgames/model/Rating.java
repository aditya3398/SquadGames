package com.adhass.creators.squadgames.model;

import org.simpleframework.xml.Element;

public class Rating {
    @Element(name = "average")
    private RatingAverage ratingAverage;

    public Rating(RatingAverage ratingAverage) {
        this.ratingAverage = ratingAverage;
    }

    public RatingAverage getRatingAverage() {
        return ratingAverage;
    }

    public void setRatingAverage(RatingAverage ratingAverage) {
        this.ratingAverage = ratingAverage;
    }
}
