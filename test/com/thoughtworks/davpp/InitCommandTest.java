package com.thoughtworks.davpp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InitCommandTest {

    @Test
	public void testExecute() {
        InitCommand cmd = new InitCommand("5 5");
        cmd.execute();
        Area area = cmd.getArea();
        int right = area.getRight();
        int upper = area.getUpper();
        assertEquals(5, right);
        assertEquals(5, upper);
    }
}
