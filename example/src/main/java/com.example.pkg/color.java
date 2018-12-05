package com.example.pkg;

public class color {
    private String colorName;
    private int colorId;

    public color(){

    }
    public color(String colorName, int colorId) {
        this.colorName = colorName;
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }
}
