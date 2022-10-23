package com.company;

public class Rectangle extends Shape implements Movable {
    double width, length;
    public String color;
    public boolean filled;
    private int x1 = 0, x2 = 0, y1 = 0, y2 = 0;

    Rectangle() {
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;

    }

    Rectangle(double width, double length, String color, boolean filled) {
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double width) {
        this.length = length;
    }

    public double getArea() {
        return (this.width * this.length);
    }

    public double getPerimeter() {
        return (2 * (this.width + this.length));
    }

    public String toString() {
        return "Прямоугольник";
    }


    public int Move(int speed, String direction, int duration) {
        MovableCircle c = new MovableCircle();
        if (direction == "+x" || direction == "-x") {
            this.x1 = c.Move(speed, direction, duration);
            this.x2 = c.Move(speed, direction, duration);
        } else if (direction == "+y" || direction == "-y") {
            this.y1 = c.Move(speed, direction, duration);
            this.y2 = c.Move(speed, direction, duration);
        } else System.out.print("\nВведено неправильно направление");
        return 0;
    }

    public void ShowPos() {
        System.out.print("\nx1 = " + this.x1 + " y1 = " + this.y1+"\nx2 = " + this.x2 + " y2 = " + this.y2);
    }
}