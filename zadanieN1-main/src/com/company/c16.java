package com.company;
import java.lang.Math.*;
public class c16 {
    c16(int x) {
        System.out.print("\nМассив случайных чисел: ");
        int[] a=new int[x];
        for (int i=0;i<a.length;i++)
        {a[i]=(int)(Math.random()*10);System.out.print(a[i]+" ");}
        for (int i=0;i<x;i++)
            for (int j=0;j<x;j++)
        if (a[i]<a[j]) {
            int tmp=a[i];
            a[i]=a[j];
            a[j]=tmp;
        }
        System.out.print("\nОтсортированный массив случайных чисел: ");
        for (int i=0;i<x;i++)
            System.out.print(a[i]+" ");
    }
}
