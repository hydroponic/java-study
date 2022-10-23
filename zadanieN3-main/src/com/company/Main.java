package com.company;

public class Main {

    public static void main(String[] args) {
        Circle c=new Circle();
        System.out.println("\nКруги\nрадиус: "+c.getRadius()+"\nкоордината Х центра: "+c.getXcenter()+"\nкоордината У центра: "+c.getYcenter());
        c.setRadius(5);
        c.setXcenter(5);
        c.setYcenter(5);
        System.out.println("\nНовый радиус: "+c.getRadius()+"\nНовая координата Х центра: "+c.getXcenter()+"\nНовая координата У центра: "+c.getYcenter()+"\nЧеловек1");
        Human h=new Human(); h.constructHuman(); System.out.println(" ");
        Book b=new Book();
        System.out.println("\nКниги\nГод написания книги: "+b.getYear()+"\nНазвание книги: "+b.getName()+"\nАвтор книги: "+b.getAuthor());
    }
}