package com.company;
import java.util.Scanner;
public class Shape {
    int n,l;
    String color;
    void setShape() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("введите кол-во углов фигуры: "); n=scanner.nextInt();
        System.out.println("введите цвет фигуры: "); color=scanner2.nextLine();
        System.out.println("введите длину сторон фигуры(см): "); l=scanner.nextInt();
    };
    int getN() {
        return n;
    }
    String getColor() {
       return color;
    }
    int getL() {
        return l;
    }
    public String toString() {
        return n+"-угольник";
    }
}
