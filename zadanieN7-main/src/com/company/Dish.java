package com.company;

abstract class Dish {
    private String name;
    public String classinfo;
    public String getName() {return name;}
    public Dish(String name){
        this.name=name;
    }
    public void viewInfo() {
        System.out.println("name: "+this.name+"\n"+this.classinfo);
    }
}
class Plates extends Dish {
    private int r;
    public Plates(String name,int r){
        super(name);
        this.classinfo="class: Plates, subclass of Dish";
        this.r=r;
    }
    public int getRadius(){
        return this.r;
    }
}
class Cups extends Dish {
    private int v;
    public Cups(String name,int v) {
        super(name);
        this.classinfo="class: Cups, subclass of Dish";
        this.v=v;
    }
    public int getVolume(){
        return this.v;
    }
}
class SpecDish extends Dish {
    private String usage;
    public SpecDish(String name, String usage){
        super(name);
        this.classinfo="class: SpecDish, subclass of Dish";
        this.usage=usage;
    }
    public String getUsage(){
        return usage;
    }

}