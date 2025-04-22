package com.ltca.week03.day01.constructor;

public class Rectangle {
    private double length;
    private double width;
    private double area;

    public  Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        this.area = this.length * this.width;
    }
    public double getArea() {
        return this.area;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
