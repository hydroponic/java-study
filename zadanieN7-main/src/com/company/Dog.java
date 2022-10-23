package com.company;

abstract class Dog {
    private String name;
    public String classinfo;
    public String getName() {return name;}
    public Dog(String name){
        this.name=name;
    }
    public void viewInfo() {
        System.out.println("name: "+this.name+"\n"+this.classinfo);
    }
}
class ovcharka extends Dog {
    public ovcharka(String name){
        super(name);
        this.classinfo="class: ovcharka, subclass of Dog";
    }
}
class dolmatin extends Dog {
    public dolmatin(String name){
        super(name);
        this.classinfo="class: dolmatin, subclass of Dog";
    }
}
class taksa extends Dog {
    public taksa(String name){
        super(name);
        this.classinfo="class: taksa, subclass of Dog";
    }
}