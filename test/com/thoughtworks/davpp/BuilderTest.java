package com.thoughtworks.davpp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BuilderTest  {
    @Test
	public void testBuilder() {
        Builder builder = new Builder("5 5");
        builder.setMarsRoverPositionCommand("1 2 N");
        builder.setMarsRoverExploreCommand("LMLMLMLMM");
        builder.runMarsRoverManager();

        String result = builder.getResult();
        assertEquals("1 3 N", result);
    }
}
