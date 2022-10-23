package com.company;

public class Main {

    public static void main(String[] args) {
        Plates n1=new Plates("тарелка",15);
        n1.viewInfo(); System.out.print("Радиус: "+n1.getRadius()+"\n");
        System.out.print("---------------------------------\n");
        ovcharka n2=new ovcharka("Рекс");
        n2.viewInfo();
    }
}