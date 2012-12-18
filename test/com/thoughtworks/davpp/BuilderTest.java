package com.thoughtworks.davpp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BuilderTest  {
	private Builder builder;

	@Before
	public void setUp() throws Exception {
		builder = new Builder();
	}

    @Test
	public void testBuilder() {
		builder.init();
		builder.setInitArea("5 5");
		builder.setMarsRoverPositionCommand("1 2 N");
		builder.setMarsRoverExploreCommand("LMLMLMLMM");
		builder.runMarsRoverManager();
		
		String result = builder.getResult();
		assertEquals("1 3 N", result);
	}
}
