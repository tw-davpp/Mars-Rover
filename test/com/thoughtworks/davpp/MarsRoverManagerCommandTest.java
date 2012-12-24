package com.thoughtworks.davpp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverManagerCommandTest {
	private MarsRoversManagerCommand command;
	private Rover rover;
	private Area area;
	private MarsRoverPositionCommand positionCmd;
	private MarsRoverExploreCommand exploreCmd;

    @Before
	public void setUp() throws Exception {
		command = new MarsRoversManagerCommand();
		area = new Area(5,5);
        rover = new Rover(area);

		positionCmd = new MarsRoverPositionCommand(rover);
		exploreCmd = new MarsRoverExploreCommand(rover);
	}

    @Test
	public void testExecute() {
		positionCmd.setCmdStr("1 2 N");
		command.addCommand(positionCmd);
		exploreCmd.setCmdStr("LMLMLMLMM");
		command.addCommand(exploreCmd);
		command.execute();

		String result = rover.getResult();
	    assertEquals("1 3 N", result);
	}
}
