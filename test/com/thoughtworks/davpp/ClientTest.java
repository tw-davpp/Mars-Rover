package com.thoughtworks.davpp;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClientTest{
	private Client client;

    @Test
	public void testClient() {
        String source =
                "5 5\r\n" +
                        "1 2 N\r\n" +
                        "LMLMLMLMM\r\n" +
                        "3 3 E\r\n" +
                        "MMRMMRMRRM\r\n";
        client = new Client(source);

        client.run();
        String result = client.getResult();
        assertEquals("1 3 N", result);
        client.run();
        result = client.getResult();
        assertEquals("5 1 E", result);
    }
}
