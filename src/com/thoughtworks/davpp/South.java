package com.thoughtworks.davpp;

public class South implements Direction {
    @Override
    public Direction turnLeft() {
        return new East();
    }

    @Override
    public Direction turnRight() {
        return new West();
    }

    @Override
    public Point move(Point point) {
        return new Point(point.getX(), point.getY() - 1);
    }

    public String toString() {
        return "S";
    }
}
