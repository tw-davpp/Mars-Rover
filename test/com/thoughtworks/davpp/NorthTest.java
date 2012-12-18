package com.thoughtworks.davpp;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class NorthTest {
	private Forward north;
	private MarsRoversManager manager;

    @Before
	public void setUp() throws Exception {
		north = new North();
		manager = new MarsRoversManager();
	}

    @Test
	public void testMove() {
        manager.setPosition(new Point(1, 1), new North());
        north.move(manager);
        Point point = manager.getSite();
        Forward facing = manager.getFacing();
        assertEquals(new Point(1, 2), point);
        assertTrue(facing instanceof North);
    }
}
