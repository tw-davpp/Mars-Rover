package com.thoughtworks.davpp;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NorthTest {

    @Test
	public void testMove() {
        assertEquals(new Point(1, 2), new North().move(new Point(1,1)));
    }
}
