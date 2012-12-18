package com.thoughtworks.davpp;

public class South implements Forward {

	@Override
	public void move(MarsRoversManager manager) {
		Point point = manager.getSite();
		manager.setSite(new Point(point.getX(), point.getY() - 1));
	}

	@Override
	public Forward turnLeft() {
		return new East();
	}

	@Override
	public Forward turnRight() {
		return new West();
	}

	public String toString() {
		return "S";
	}
}
