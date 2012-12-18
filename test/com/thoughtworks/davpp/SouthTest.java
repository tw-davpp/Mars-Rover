package com.thoughtworks.davpp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class SouthTest {
	private Forward south;
	private MarsRoversManager manager;

    @Before
	public void setUp() throws Exception {
		south = new South();
		manager = new MarsRoversManager();
	}

    @Test
	public void testMove() {
        manager.setPosition(new Point(1, 1), new South());
        south.move(manager);
        Point point = manager.getSite();
        Forward facing = manager.getFacing();
        assertEquals(new Point(1, 0), point);
        assertTrue(facing instanceof South);
    }
}
