package com.company;

public class MovablePoint {
    public double x=0,y=0;
    public void ShowPos() {
        System.out.print("\nx = "+this.x+" y = "+this.y);
    }
    MovablePoint() {}
    public void  MovePoint(double speed,String direction,double duration) {
        if (direction=="+x") this.x+=speed;
        else if (direction=="-x") this.x-=speed;
        else if (direction=="+y") this.y+=speed;
        else if (direction=="-y") this.y-=speed;
        else System.out.print("\nВведено неправильно направление");
    }
}
