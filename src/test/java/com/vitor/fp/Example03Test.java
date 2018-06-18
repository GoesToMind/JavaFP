package com.vitor.fp;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Example03 Test")
class Example03Test {

    @Test
    public void testAdd3And5(){

        int expected = 8;
        int actual = Example03.add.apply(3).apply(5);
        assertEquals(expected, actual, "Should return 8");

    }

}