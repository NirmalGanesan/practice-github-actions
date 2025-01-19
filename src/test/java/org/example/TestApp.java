package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestApp {
    @Test
    public void testAdd() {
        assertEquals(10, Main.add(9, 1));
    }
}
