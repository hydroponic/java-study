package com.company;

import java.util.Scanner;

public class Ball {
    String target,color,brand,typeOfSurface;
    int size;
    void setBall() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("введите назначение мяча: "); target=scanner.nextLine();
        System.out.println("введите цвет мяча: "); color=scanner.nextLine();
        System.out.println("введите бренд мяча: "); brand=scanner.nextLine();
        System.out.println("введите тип поверхности мяча: "); typeOfSurface=scanner.nextLine();
        System.out.println("введите размер мяча: "); size=scanner2.nextInt();
    }
    String getTarget() {
        return target;
    }
    String getColor() {
        return color;
    }
    String getBrand() {
        return brand;
    }
    String getTypeOfSurface() {
        return typeOfSurface;
    }
    int getSize() {
        return size;
    }
}
