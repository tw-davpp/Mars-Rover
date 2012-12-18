package com.thoughtworks.davpp;

public class North implements Forward {
	@Override
	public void move(MarsRoversManager manager) {
		Point point = manager.getSite();
		manager.setSite(new Point(point.getX(), point.getY() + 1));
	}

	@Override
	public Forward turnLeft() {
		return new West();
	}

	@Override
	public Forward turnRight() {
		return new East();
	}

	public String toString() {
		return "N";
	}

}
