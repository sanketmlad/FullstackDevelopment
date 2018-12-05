package com.example.pkg;

public class Point {
    private int x;
    private int y;

    public Point(){
        System.out.println("Called constructor");
    }

    public Point(double d, float f, float f1){
        System.out.println("Called constructor with message " + d + ", " +  f + ", " + f1);
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
