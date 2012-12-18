package com.thoughtworks.davpp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class MarsRoversManagerTest {
	private MarsRoversManager manager;
	private Area area;

    @Before
	public void setUp() throws Exception {
		manager = new MarsRoversManager();
		area = new Area();
	}

    @Test
	public void testSetPosition() {
		manager.setPosition(new Point(1,1),new North());
		Point point = manager.getSite();
		Forward facing = manager.getFacing();
		assertEquals(new Point(1, 1), point);
        assertTrue(facing instanceof North);
    }

    @Test
	public void testExplore() {
        area.init(5, 5);
        manager.setArea(area);
        manager.setPosition(new Point(1, 2), new North());
        manager.explore("LMLMLMLMM");
        String result = manager.getResult();
        assertEquals("1 3 N", result);
    }

    @Test
	public void testExplore2() {
        area.init(5, 5);
        manager.setArea(area);
        manager.setPosition(new Point(3, 3), new East());
        manager.explore("MMRMMRMRRM");
        String result = manager.getResult();
        assertEquals("5 1 E", result);
    }

    @Test
	public void testExploreByOutOfSpace() {
		area.init(5, 5);
		manager.setArea(area);
        manager.setPosition(new Point(1, 2), new North());
        manager.explore("MMMMMMMM");
        String result = manager.getResult();
		assertEquals(manager.outOfSpaceStr, result);
	}
}
