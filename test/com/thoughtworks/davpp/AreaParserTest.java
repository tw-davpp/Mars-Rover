package com.thoughtworks.davpp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AreaParserTest {
    @Test
    public void test_area_parser() throws Exception {
        AreaParser areaParser = new AreaParser("10 10");
        areaParser.parse();

        assertEquals(10, areaParser.getRight());
        assertEquals(10, areaParser.getUpper());
    }
    @Test
    public void test_area_parser2() throws Exception {
        AreaParser areaParser = new AreaParser("5 5");
        areaParser.parse();

        assertEquals(5, areaParser.getRight());
        assertEquals(5, areaParser.getUpper());
    }
}
