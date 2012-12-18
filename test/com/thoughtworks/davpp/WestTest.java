package com.thoughtworks.davpp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class WestTest  {
	private Forward west;
	private MarsRoversManager manager;

    @Before
	public void setUp() throws Exception {
		west = new West();
		manager = new MarsRoversManager();
	}

    @Test
	public void testMove() {
        manager.setPosition(new Point(1, 1), new West());
        west.move(manager);
        Point point = manager.getSite();
        Forward facing = manager.getFacing();
        assertEquals(new Point(0, 1), point);
        assertTrue(facing instanceof West);
    }
}
