package com.thoughtworks.davpp;

public interface Direction {
	void move(Rover manager);

	Direction turnLeft();

	Direction turnRight();

    Point move(Point point);
}
