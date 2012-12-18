package com.thoughtworks.davpp;

public class Point {
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public boolean equals(Object o) {
		Point p = (Point) o;
		if (p.getX() == x && p.getY() == y)
			return true;
		else
			return false;
	}
}
