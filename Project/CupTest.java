package com.jensen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {
    @Test
    void testobjectcreation() {
        Cup cup = new Cup("water",30.0);
        assertEquals("water",cup.getLiquidType());
    }

    @Test
    void testobjectcreation1()
     {
        Cup cup =new Cup("juice",75.0);
        assertEquals("juice",cup.getLiquidType());
        assertEquals(75.0 ,cup.getPercentFull(), 0.00001);
                ;

    }
}