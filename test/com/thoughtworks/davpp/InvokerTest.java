package com.thoughtworks.davpp;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class InvokerTest  {
	private Invoker invoker;
	private Area area;
	private ParseCommand initCommand;
	private MarsRoversManagerCommand marsRoverCommand;
	private MarsRoverFactory rover;

    @Before
	public void setUp() throws Exception {
		invoker = new Invoker();
		area = new Area();
		initCommand = new InitCommand(area);
		marsRoverCommand = new MarsRoversManagerCommand();
		rover = new MarsRoverOperate();
		rover.setArea(area);
	}

    @Test
	public void testInitArea() {
		String cmdStr = "5 5";
		invoker.setInitCommand(initCommand);
		invoker.initArea(cmdStr);
		int right = area.getRight();
		int upper = area.getUpper();
		assertEquals(5, right);
		assertEquals(5, upper);
	}

    @Test
	public void testRunMarsRover() {
		String cmdStr = "5 5";
		invoker.setInitCommand(initCommand);
		invoker.initArea(cmdStr);

		MarsRoverPositionCommand posCmd = new MarsRoverPositionCommand();
		posCmd.setMarsRoverManager(rover);
		posCmd.setCmdStr("1 2 N");

		marsRoverCommand.addCommand(posCmd);
		invoker.setMarsRoverCommand(marsRoverCommand);
		invoker.runMarsRover();

		Point point = rover.getSite();
		Forward face = rover.getFacing();
		assertEquals(new Point(1, 2), point);
        assertTrue(face instanceof North);
    }
}
