package com.thoughtworks.davpp;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MarsRoverFactoryTest {
	private MarsRoverFactory rover;
	private Area area;

    @Before
	public void setUp() throws Exception {
		rover = new MarsRoverOperate();
		area = new Area();
		rover.setArea(area);
	}

    @Test
	public void testSetPosition() {
        rover.setPosition(new Point(1, 2), new North());
        Point site = rover.getSite();
        Forward face = rover.getFacing();
        assertEquals(new Point(1, 2), site);
        assertTrue(face instanceof North);
    }

    @Test
	public void testExplore() {
		area.init(5, 5);
		rover.setArea(area);
        rover.setPosition(new Point(1, 2), new North());
        rover.explore("LMLMLMLMM");
        String result = rover.getResult();
	    assertEquals("1 3 N", result);
	}
}
