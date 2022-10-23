package com.company;

import java.util.Scanner;

public class Book {
    int year;
    String name,author;
    public Book() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("введите год написания книги: "); year=scanner2.nextInt();
        System.out.println("введите название книги: "); name=scanner.nextLine();
        System.out.println("введите автора книги: "); author=scanner.nextLine();
    }
    public void setYear(int x) {
        year=x;
    }
    public void setName(String x) {
        name=x;
    }
    public void setAuthor(String x) {
       author=x;
    }
    public int getYear() {
        return year;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
}
