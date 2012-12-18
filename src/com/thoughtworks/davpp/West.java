package com.thoughtworks.davpp;

public class West implements Forward {
	@Override
	public void move(MarsRoversManager manager) {
		Point point = manager.getSite();
		manager.setSite(new Point(point.getX() - 1, point.getY()));
	}

	@Override
	public Forward turnLeft() {
		return new South();
	}

	@Override
	public Forward turnRight() {
		return new North();
	}

	public String toString() {
		return "W";
	}
}
