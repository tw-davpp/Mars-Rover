package com.thoughtworks.davpp;

public interface Forward {
	public void move(MarsRoversManager manager);

	public Forward turnLeft();

	public Forward turnRight();
}
