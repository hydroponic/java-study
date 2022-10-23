package com.company;

import java.util.Scanner;

public class Book {
    int l;
    String name,author;
    void setBook() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("введите кол-во страниц в книге: "); l=scanner2.nextInt();
        System.out.println("введите название книги: "); name=scanner.nextLine();
        System.out.println("введите автора книги: "); author=scanner.nextLine();
    }
    int getLength() {
        return l;
    }
    String getName() {
        return name;
    }
    String getAuthor() {
        return author;
    }
}
