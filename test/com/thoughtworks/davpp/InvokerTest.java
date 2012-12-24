package com.thoughtworks.davpp;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class InvokerTest  {
	private Invoker invoker;
	private Area area;
	private InitCommand initCommand;
	private MarsRoversManagerCommand marsRoverCommand;
	private Rover rover;

    @Before
	public void setUp() throws Exception {
        String cmdStr = "5 5";
        initCommand = new InitCommand(cmdStr);
        marsRoverCommand = new MarsRoversManagerCommand();
		invoker = new Invoker(initCommand,marsRoverCommand);
        area = initCommand.getArea();
        rover = new Rover(area);
    }

    @Test
	public void testInitArea() {
        int right = area.getRight();
		int upper = area.getUpper();
		assertEquals(5, right);
		assertEquals(5, upper);
	}

    @Test
	public void testRunMarsRover() {
		MarsRoverPositionCommand posCmd = new MarsRoverPositionCommand(rover);
		posCmd.setCmdStr("1 2 N");

		marsRoverCommand.addCommand(posCmd);
		invoker.runMarsRover();

		Point point = rover.getSite();
		Direction face = rover.getFacing();
		assertEquals(new Point(1, 2), point);
        assertTrue(face instanceof North);
    }
}
