package com.example.caleb.myjourney;

/**
 * Created by Caleb on 5/10/2016.
 */

public class ListItem {
    private String name;
    private boolean isButton = false;
    private int image;

    public ListItem(String name, boolean isButton) {
        this.name = name;
        this.isButton = isButton;
    }

    public ListItem(String name) {
        this.name = name;
    }

    public ListItem(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isButton() {
        return isButton;
    }

    public void setButton(boolean button) {
        isButton = button;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
