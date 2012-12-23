package com.thoughtworks.davpp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {
    private Rover rover;
    private Area area;

    @Before
    public void setUp() throws Exception {
        area = new Area(5 ,5);
    }

    @Test
    public void testExplore() {
        rover = new Rover(area, new Point(1, 2), new North());
        rover.explore("LMLMLMLMM");
        String result = rover.getResult();
        assertEquals("1 3 N", result);
    }

    @Test
    public void testExplore2() {
        rover = new Rover(area, new Point(3, 3), new East());
        rover.explore("MMRMMRMRRM");
        String result = rover.getResult();
        assertEquals("5 1 E", result);
    }

    @Test
    public void testExploreByOutOfSpace() {
        rover = new Rover(area, new Point(1, 2), new North());
        rover.explore("MMMMMMMM");
        String result = rover.getResult();
        assertEquals(rover.outOfSpaceStr, result);
    }
}
