package com.thoughtworks.davpp;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class MarsRoverExploreParserTest {
    @Test
    public void test_mars_rover_explore_parser() throws Exception {
        String cmd = "LMLMLMRRLMRLMRLRM";
        MarsRoverExploreParser marsroverExploreParser = new MarsRoverExploreParser(cmd);
        marsroverExploreParser.parse();
        assertTrue(marsroverExploreParser.matchCondition());
    }

    @Test
    public void test_mars_rover_explore_parser_with_false() throws Exception {
        String cmd = "LMLMLMRNRLMRLMRLRM";
        MarsRoverExploreParser marsroverExploreParser = new MarsRoverExploreParser(cmd);
        marsroverExploreParser.parse();

        assertFalse(marsroverExploreParser.matchCondition());

    }
}
