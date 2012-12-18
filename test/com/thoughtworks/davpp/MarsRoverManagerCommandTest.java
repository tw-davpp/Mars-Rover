package com.thoughtworks.davpp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverManagerCommandTest {
	private MarsRoversManagerCommand command;
	private MarsRoverFactory manager;
	private Area area;
	private MarsRoverPositionCommand positionCmd;
	private MarsRoverExploreCommand exploreCmd;

    @Before
	public void setUp() throws Exception {
		command = new MarsRoversManagerCommand();
		manager = new MarsRoverOperate();
		area = new Area();
		area.init(5, 5);
		manager.setArea(area);

		positionCmd = new MarsRoverPositionCommand();
		positionCmd.setMarsRoverManager(manager);

		exploreCmd = new MarsRoverExploreCommand();
		exploreCmd.setMarsRoverManager(manager);
	}

    @Test
	public void testExecute() {
		positionCmd.setCmdStr("1 2 N");
		command.addCommand(positionCmd);
		exploreCmd.setCmdStr("LMLMLMLMM");
		command.addCommand(exploreCmd);
		command.execute();

		String result = manager.getResult();
	    assertEquals("1 3 N", result);
	}
}
