package xyz.cescoferraro.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit {

    private Main mainClass = new Main();

    @Test
    public void testPrintMessage() {
        String message = "Hello World";
        assertEquals(message, mainClass.CESCO(message));
    }
}