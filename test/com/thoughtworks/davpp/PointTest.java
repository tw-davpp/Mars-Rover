package com.thoughtworks.davpp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest  {
	Point point;

    @Test
	public void testInitPoint() {
		point = new Point(10, 11);
		int x = point.getX();
		int y = point.getY();
		assertEquals(10, x);
		assertEquals(11, y);
	}

    @Test
	public void testEqualsByTrue() {
		point = new Point(10, 11);
		boolean result = point.equals(new Point(10, 11));
		assertEquals(true, result);
	}

    @Test
	public void testEqualsByFalse() {
		point = new Point(10, 11);
		boolean result = point.equals(new Point(11, 10));
	    assertEquals(false, result);
	}
}
