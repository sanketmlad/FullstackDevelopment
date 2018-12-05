package com.example.pkg;
import java.util.List;
import java.util.Map;

public class animal {
    private double weight;
    private float height;
    private String speciesName;
    private color Color;
    private size Size;
    private Map <Integer,String> names;

    public Map<Integer, String> getNames() {
        return names;
    }

    public void setNames(Map<Integer, String> names) {
        this.names = names;
    }

    public size getSize() {
        return Size;
    }

    public void setSize(size size) {
        Size = size;
    }

    public color getColor() {
        return Color;
    }

    public void setColor(color color) {
        Color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public animal(){

    }
    /*
    public animal(double weight, float height, String speciesName, color color) {
        this.weight = weight;
        this.height = height;
        this.speciesName = speciesName;
        Color = color;
    }*/
/*
    public animal(double weight, float height, String speciesName){
        super();
        this.height = height;
        this.speciesName = speciesName;
        this.weight = weight;
    }
*/
}
