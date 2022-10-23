package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Выберите тип фигуры: 1-круг,2-прямоугольник,3-квадрат...");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        if (id==1) {
            System.out.print("\nВведите радиус круга:");
            double radius = scanner.nextInt();
            Circle c = new Circle(radius);
            System.out.print("Радиус "+c.toString() + "а = "+c.getRadius()+"\nПлощадь "+c.toString()+"а = " +
                    c.getArea()+"\nПериметр "+c.toString()+"а = " +c.getPerimeter());
        } else if (id==2) {
            System.out.print("\nВведите длину и ширину прямоугольника:");
            double width = scanner.nextInt();
            double length = scanner.nextInt();
            Rectangle r = new Rectangle(width, length);
            System.out.print("Ширина "+r.toString() + "а = "+r.getWidth()+" Длина "+
                    r.toString() + "а = "+r.getLength()+"\nПлощадь "+r.toString()+"а = " +
                    r.getArea()+"\nПериметр "+r.toString()+"а = " +r.getPerimeter());
        } else if (id==3) {
            System.out.print("\nВведите длину стороны квадрата=");
            double side = scanner.nextInt();
            Square s = new Square(side);
            System.out.print("Длина сторон "+s.toString() + "а = "+
                    s.getSide()+"\nПлощадь "+s.toString()+"а = " +
                    s.getArea()+"\nПериметр "+s.toString()+"а = " +s.getPerimeter());

        }
        else System.out.print("\nОшибка, введено неверное значение.");
    }
}
