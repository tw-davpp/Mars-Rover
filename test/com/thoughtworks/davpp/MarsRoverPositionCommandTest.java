package com.thoughtworks.davpp;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MarsRoverPositionCommandTest {
    private MarsRoverPositionCommand command;
    private Rover rover;
    private Area area;

    @Before
    public void setUp() throws Exception {
        area = new Area(5, 5);
        rover = new Rover(area);
        command = new MarsRoverPositionCommand(rover);

    }

    @Test
    public void testExecute() {
        command.setCmdStr("1 2 N");
        command.execute();
        Direction facing = rover.getFacing();
        assertEquals(new Point(1, 2), rover.getSite());
        assertTrue(facing instanceof North);
    }
}
