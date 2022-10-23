package com.company;

public class MovableRectangle implements Movable {
    public int MovePoint(int speed, String direction, int duration) {
        if (direction == "+x" || direction == "+y") return speed * duration;
        else if (direction == "-x" || direction == "-y") return -(speed * duration);
        return 0;
    }

    public int Move(int speed, String direction, int duration) {
        MovePoint(speed,direction,duration);
        MovePoint(speed, direction, duration);
        return 0;
    }

    public void ShowPos() {
    }
}
