package com.thoughtworks.davpp;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class MarsRoverPositionParserTest {
    @Test
    public void test_mars_rover_position_parser() throws Exception {
        MarsRoverPositionParser marsRoverPositionParser = new MarsRoverPositionParser("10 11 N");
        marsRoverPositionParser.parse();

        assertEquals(new Point(10, 11), marsRoverPositionParser.getPoint());
        Direction direction = marsRoverPositionParser.getFacing();
        assertTrue(direction instanceof North);
    }
}
