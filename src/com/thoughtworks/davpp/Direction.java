package com.thoughtworks.davpp;

public interface Direction {
	Direction turnLeft();

	Direction turnRight();

    Point move(Point point);
}
