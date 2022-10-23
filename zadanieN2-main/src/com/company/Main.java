package com.company;

public class Main {

    public static void main(String[] args) {
	Shape x=new Shape();
	x.setShape();
	System.out.println("кол-во углов: "+x.getN());
        System.out.println("цвет фигуры: "+x.getColor());
        System.out.println("длина сторон фигуры: "+x.getL()+" см");
        System.out.println("данная фигура: правильный "+x.toString());
        Book b=new Book();
        b.setBook();
        System.out.println("название книги: "+b.getName());
        System.out.println("автор кники: "+b.getAuthor());
        System.out.println("кол-во страниц в книге: "+b.getLength());
        Ball bb=new Ball();
        bb.setBall();
        System.out.println("цвет мяча: "+bb.getColor());
        System.out.println("название бренда мяча: "+bb.getBrand());
        System.out.println("назначение мяча: "+bb.getTarget());
        System.out.println("тип поверхности мяча: "+bb.getTypeOfSurface());
        System.out.println("размер мяча: "+bb.getSize());
        System.out.println("\nТест Собак");
        Dog d1 = new Dog("собака1", 2);
        Dog d2 = new Dog("собака2", 7);
        Dog d3 = new Dog("собака3");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
