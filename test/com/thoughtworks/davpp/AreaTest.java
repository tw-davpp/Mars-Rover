package com.thoughtworks.davpp;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AreaTest  {

    @Test
	public void testIsSafeByTrue() {
		Area area = new Area(10,10);
		Point point = new Point(10, 10);
		boolean result = area.isSafe(point);
		assertEquals(true, result);
	}

    @Test
	public void testIsSafeByFalse() {
        Area area = new Area(10, 10);
        Point point = new Point(11, 10);
        boolean result = area.isSafe(point);
        assertEquals(false, result);
    }
}
