package com.thoughtworks.davpp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WestTest {
    @Test
    public void testMove() {
        assertEquals(new Point(0, 1), new West().move(new Point(1, 1)));
    }
}
