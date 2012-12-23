package com.thoughtworks.davpp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EastTest {
    @Test
	public void testMove() {
        assertEquals(new Point(2, 1), new East().move(new Point(1, 1)));
    }
}
