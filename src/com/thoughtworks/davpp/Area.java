package com.thoughtworks.davpp;

public class Area {
	private int right;
	private int upper;
	private final int left = 0;
	private final int bottom = 0;

    public Area(int right, int upper) {
        this.right = right;
        this.upper = upper;
    }

	public int getRight() {
		return right;
	}

	public int getUpper() {
		return upper;
	}

	public boolean isSafe(Point point) {
		if (point.getX() >= left && point.getX() <= right
				&& point.getY() >= bottom && point.getY() <= upper)
			return true;
		else
			return false;
	}
}
