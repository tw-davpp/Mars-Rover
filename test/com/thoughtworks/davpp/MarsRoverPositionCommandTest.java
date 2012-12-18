package com.thoughtworks.davpp;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MarsRoverPositionCommandTest {
	private MarsRoverPositionCommand command;
	private MarsRoverFactory rover;
	private Area area;

    @Before
	public void setUp() throws Exception {
		command = new MarsRoverPositionCommand();
		rover = new MarsRoverOperate();
		area = new Area();
	}

    @Test
	public void testExecute() {
        area.init(5, 5);
        rover.setArea(area);
        command.setMarsRoverManager(rover);
        command.setCmdStr("1 2 N");
        command.execute();
        Forward facing = rover.getFacing();
        assertEquals(new Point(1, 2), rover.getSite());

        assertTrue(facing instanceof North);
    }
}
