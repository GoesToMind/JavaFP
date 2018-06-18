package com.vitor.fp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example04Test {

    @Test
    public void testHigherOrderFunctionResult6(){

        Integer value = 2;
        Integer expected = 6;
        IFunction<Integer, Integer> addFirst = x -> x + value ;
        IFunction<Integer, Integer> addSecond = x -> x + value;
        IFunction<Integer, Integer> f = Example04.compose.apply(addFirst).apply(addSecond);
        Integer actual = f.apply(value);
        assertEquals(expected, actual, "Should return 6");

    }

}