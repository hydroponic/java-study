package com.company;

import java.util.Scanner;

public class Circle {
    int r,a,b;
    public Circle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите радиус круга: "); r=scanner.nextInt();
        System.out.println("введите координату x центра кргуа: "); a=scanner.nextInt();
        System.out.println("введите координату y центра круга: "); b=scanner.nextInt();
    }
    public int getRadius() {
        return r;
    }
    public int getXcenter() {
        return a;
    }
    public int getYcenter() {
        return b;
    }
    public void setRadius(int x) {
        r=x;
    }
    public void setXcenter(int x) {
        a=x;
    }
    public void setYcenter(int x) {
        b=x;
    }
}
