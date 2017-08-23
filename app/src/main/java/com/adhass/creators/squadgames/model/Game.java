package com.adhass.creators.squadgames.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by adityanadkarni on 8/8/17.
 */

public class Game implements Serializable{
    private String title;
    private double rating;
    private int coverImage;

    public Game(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(int coverImage) {
        this.coverImage = coverImage;
    }
}
