package com.thoughtworks.davpp;

public class North implements Direction {
    @Override
    public Direction turnLeft() {
        return new West();
    }

    @Override
    public Direction turnRight() {
        return new East();
    }

    @Override
    public Point move(Point point) {
        return new Point(point.getX(), point.getY() + 1);
    }

    public String toString() {
        return "N";
    }

}
