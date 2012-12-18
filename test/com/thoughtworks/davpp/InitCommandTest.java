package com.thoughtworks.davpp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InitCommandTest {
	private Area area;
	private InitCommand cmd;

    @Before
	public void setUp() throws Exception {
		area = new Area();
		cmd = new InitCommand(area);
	}

    @Test
	public void testExecute() {
		cmd.setCmdStr("5 5");
		cmd.execute();
		int right = area.getRight();
		int upper = area.getUpper();
		assertEquals(5, right);
		assertEquals(5, upper);
	}
}
