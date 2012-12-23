package com.thoughtworks.davpp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverExploreCommandTest  {
	private MarsRoverExploreCommand command;
	private Rover rover;
	private Area area;

    @Before
	public void setUp() throws Exception {
		command = new MarsRoverExploreCommand();
		rover = new Rover();
		area = new Area();
	}

    @Test
	public void testExecute() {
        area.init(5, 5);
        rover.setArea(area);
        rover.setPosition(new Point(1, 2), new North());
        command.setMarsRoverManager(rover);
        command.setCmdStr("LMLMLMLMM");
        command.execute();
        String result = rover.getResult();
        assertEquals("1 3 N", result);
    }

    @Test
    public void test_explore_with_wrong_command() throws Exception {
        area.init(5, 5);
        rover.setArea(area);
        rover.setPosition(new Point(1, 2), new North());
        command.setMarsRoverManager(rover);
        command.setCmdStr("LMLMNLMLMM");
        command.execute();
        String result = rover.getResult();
        assertEquals(null, result);
    }
}
