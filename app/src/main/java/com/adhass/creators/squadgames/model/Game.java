package com.adhass.creators.squadgames.model;

import android.graphics.drawable.Drawable;
import android.util.Log;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;

public class Game implements Serializable {
    @Element(name = "name")
    private String title;
    @Element(name = "stats")
    private Rating rating;
    @Element(name = "image")
    private String coverImage;

    public Game(String title, Rating rating) {
        this.title = title;
        this.rating = rating;
    }

    public Game(String title, int rating) {
        this.title = title;
        this.rating = new Rating(new RatingAverage(rating));
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Drawable getCoverImage() {
        if (coverImage != null) {
            try {
                InputStream inputStream = (InputStream) new URL(coverImage).getContent();
                return Drawable.createFromStream(inputStream, title);
            } catch (Exception e) {
                Log.e(e.getClass().getSimpleName(), e.getMessage());
                return null;
            }

        }
        return null;

    }

    public void setCoverImage(String coverImageURL) {
        this.coverImage = coverImageURL;
    }

    /**
     * Created by adityanadkarni on 8/8/17.
     */
}

