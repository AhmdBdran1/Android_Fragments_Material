package com.example.cardview;

public class gameModel {
    private int image;
    private String gameName;
    private int year;

    public gameModel(int image, String gameName, int year) {
        this.image = image;
        this.gameName = gameName;
        this.year = year;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
