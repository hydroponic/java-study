package com.company;
import java.util.Scanner;
public class Human {
    public int v,l,k,size,w;
    private String name;
    public Human(){
    }
    public void constructHuman() {
        Head h1=new Head(30);
        Hands h2=new Hands(20,2);
        Leggs h3=new Leggs(40,2,45);
        Body b=new Body(40,20);
        System.out.print("Объем головы: "+ h1.getV()+"\nДлина рук(-и): "+h2.getL()+"\nКол-во рук: "+h2.getK()+"\nДлина ног(-и): "+h3.getL()+"\nКол-во ног: "+h3.getK());
        System.out.print("\nРазмер ноги: "+h3.getSize()+"\nДлина тела: "+b.getL()+"\nШирина тела: "+b.getW());
    }
}
class Head extends Human {
    public Head(int v) {
        this.v=v;
    }
    public int getV() {
        return this.v;
    }
}
class Hands extends Human {
    public Hands(int l,int k) {
        this.l=l; this.k=k;
    }
    public int getL() {
        return this.l;
    }
    public int getK() {
        return this.k;
    }
}
class Leggs extends Human {
    public Leggs(int l,int k,int size) {
        this.l=l;this.k=k;this.size=size;
    }
    public int getL() {
        return this.l;
    }
    public int getK() {
        return this.k;
    }
    public int getSize() {
        return this.size;
    }
}
class Body extends Human {
    public Body(int l,int w) {
        this.l=l;this.w=w;
    }
    public int getL() {
        return this.l;
    }
    public int getW() {
        return this.w;
    }
}