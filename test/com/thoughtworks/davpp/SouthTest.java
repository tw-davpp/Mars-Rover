package com.thoughtworks.davpp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SouthTest {
    @Test
    public void testMove() {
        assertEquals(new Point(1, 0), new South().move(new Point(1, 1)));
    }
}
