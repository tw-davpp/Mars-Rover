package com.thoughtworks.davpp;

public class East implements Direction {
	@Override
	public Direction turnLeft() {
		return new North();
	}

	@Override
	public Direction turnRight() {
		return new South();
	}

    @Override
    public Point move(Point point) {
        return new Point(point.getX()+1,point.getY());
    }

    public String toString() {
		return "E";
	}
}
