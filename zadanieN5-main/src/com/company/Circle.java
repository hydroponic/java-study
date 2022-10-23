package com.company;

public class Circle extends Shape implements Movable {
    public double radius;
    public String color;
    public boolean filled;
    public int x, y;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (this.radius * this.radius * 3.14);
    }

    public double getPerimeter() {
        return (2 * 3.14 * this.radius);
    }

    public String toString() {
        return "Круг";
    }


    public int Move(int speed, String direction, int duration) {
        MovableCircle c = new MovableCircle();
        if (direction == "+x" || direction == "-x")
            this.x = c.Move(speed, direction, duration);
        else if (direction == "+y" || direction == "-y")
            this.y = c.Move(speed, direction, duration);
        else System.out.print("\nВведено неправильно направление");
        return 0;
    }

    public void ShowPos() {
        System.out.print("\nx = " + this.x + " y = " + this.y);
    }
}