package com.thoughtworks.davpp;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class RoverExploreParserTest {
    @Test
    public void test_mars_rover_explore_parser() throws Exception {
        String cmd = "LMLMLMRRLMRLMRLRM";
        RoverExploreParser marsroverExploreParser = new RoverExploreParser(cmd);
        marsroverExploreParser.parse();
        assertTrue(marsroverExploreParser.matchCondition());
    }

    @Test
    public void test_mars_rover_explore_parser_with_false() throws Exception {
        String cmd = "LMLMLMRNRLMRLMRLRM";
        RoverExploreParser marsroverExploreParser = new RoverExploreParser(cmd);
        marsroverExploreParser.parse();

        assertFalse(marsroverExploreParser.matchCondition());

    }
}
