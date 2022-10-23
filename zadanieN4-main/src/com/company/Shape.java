package com.company;
import java.util.Scanner;
abstract class Shape {
    public String color; int id; public boolean filled; Circle c; Rectangle r; Square s;
    Shape() {}
    Shape(String color, boolean filled) {this.color=color;this.filled=filled;}
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color=color;
    }
    public boolean isFilled() {
        return (this.filled?true:false);
    }
    public void setFilled(boolean filled) {
        this.filled=filled;
    }
}
