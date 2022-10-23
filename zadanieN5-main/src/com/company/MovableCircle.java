package com.company;

public class MovableCircle implements Movable{
    public int  MovePoint(int speed,String direction,int duration) {
        if (direction=="+x" || direction=="+y") return speed*duration;
        else if (direction=="-x" || direction=="-y") return -(speed*duration);
        return 0;
    }
    public int Move(int speed,String direction,int duration) {
        return MovePoint(speed,direction,duration);
    }
    public void ShowPos() { }
}