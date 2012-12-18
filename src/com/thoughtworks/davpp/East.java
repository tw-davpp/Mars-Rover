package com.thoughtworks.davpp;

public class East implements Forward {
	@Override
	public void move(MarsRoversManager manager) {
		Point point = manager.getSite();
		manager.setSite(new Point(point.getX() + 1, point.getY()));
	}

	@Override
	public Forward turnLeft() {
		return new North();
	}

	@Override
	public Forward turnRight() {
		return new South();
	}

	public String toString() {
		return "E";
	}
}
