package com.navikraft.trial.navsacademy;

import android.media.Image;

/**
 * Created by AmazingNaveen on 24/02/2016.
 */
public class Img {

    private int courseNumber;
    private String title;
    private String description;
    private int image;

    public Img(int courseNumber, String title, String description, int image) {
        this.courseNumber = courseNumber;
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

    @Override
    public String toString() {
        return title;
    }
}
