package com.thoughtworks.davpp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverExploreCommandTest {
	private RoverExploreCommand command;
	private Rover rover;
	private Area area;

    @Before
	public void setUp() throws Exception {
        area = new Area(5, 5);
        rover = new Rover(area);
        command = new RoverExploreCommand(rover);
    }

    @Test
	public void testExecute() {
        rover.setPosition(new Point(1, 2), new North());
        command.setCmdStr("LMLMLMLMM");
        command.execute();
        String result = rover.getResult();
        assertEquals("1 3 N", result);
    }

    @Test
    public void test_explore_with_wrong_command() throws Exception {
        rover.setPosition(new Point(1, 2), new North());
        command.setCmdStr("LMLMNLMLMM");
        command.execute();
        String result = rover.getResult();
        assertEquals(null, result);
    }
}
