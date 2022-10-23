package com.company;

public class c13 {
    c13(int[] a) {
        int sum=0;
        for (int i=0;i<a.length;i++)
            sum+=a[i];
        System.out.println("Сумма элементов массива = "+sum);
    }
}
