package com.company;

class Square extends Rectangle {
    double side;
    Square(double side) {
        this.side=side;
    }
   Square(double side,String color,boolean filled) {
        this.side=side;this.color=color;this.filled=filled;
   }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side=side;
    }
    public double getArea() {
        return (this.side*this.side);
    }
    public double getPerimeter() {
        return (4*side);
    }
    public String toString() {
        return "Квадрат";
    }
}
