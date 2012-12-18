package com.thoughtworks.davpp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AreaTest  {
	protected Area area;

	@Before
	public void setUp() throws Exception {
		area = new Area();
	}

    @Test
	public void testIsSafeByTrue() {
		area.init(10,10);
		Point point = new Point(10, 10);
		boolean result = area.isSafe(point);
		assertEquals(true, result);
	}

    @Test
	public void testIsSafeByFalse() {
		area.init(10,10);
		Point point = new Point(11, 10);
		boolean result = area.isSafe(point);
		assertEquals(false, result);
	}
}
