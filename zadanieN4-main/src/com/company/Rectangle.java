package com.company;

class Rectangle extends Shape {
    double width, length;
    Rectangle() {}
    Rectangle(double width,double length) {
        this.width=width;this.length=length;

    }
    Rectangle(double width,double length,String color,boolean filled) {}
    public double getWidth() {
        return this.width;
    }
    public double getLength() {
        return this.length;
    }
    public void setWidth(double width) {
        this.width=width;
    }
    public void setLength(double width) {
        this.length=length;
    }
    public double getArea() {
        return (this.width*this.length);
    }
    public double getPerimeter() {
        return (2*(this.width+this.length));
    }
    public String toString() {
        return "Прямоугольник";
    }
}
