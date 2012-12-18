package com.thoughtworks.davpp;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class EastTest {
	private Forward east;
	private MarsRoversManager manager;

	@Before
	public void setUp() throws Exception {
		east = new East();
		manager = new MarsRoversManager();
	}

    @Test
	public void testMove() {
		manager.setPosition(new Point(1, 1), new East());
        east.move(manager);
        Point point = manager.getSite();
		Forward facing = manager.getFacing();
		assertEquals(new Point(2, 1), point);
        assertTrue(facing instanceof East);
    }
}
