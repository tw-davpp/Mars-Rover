package com.thoughtworks.davpp;

public class East implements Direction {
	@Override
	public void move(Rover manager) {
		Point point = manager.getSite();
		manager.setSite(new Point(point.getX() + 1, point.getY()));
	}

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
