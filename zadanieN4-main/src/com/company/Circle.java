package com.company;

class Circle extends Shape {
    public double radius;
    public String color;
    public boolean filled;
    Circle() {}
    Circle(double radius) {
        this.radius=radius;
    }
    Circle(double radius,String color,boolean filled) {
        this.radius=radius;this.color=color;this.filled=filled;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius=radius;
    }
    public double getArea() {
        return (this.radius*this.radius*3.14);
    }
    public double getPerimeter() {
        return (2*3.14*this.radius);
    }
    public String toString() {
        return "Круг";
    }
}
