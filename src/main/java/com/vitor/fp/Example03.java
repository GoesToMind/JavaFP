package com.vitor.fp;

public class Example03 {

    public static IFunction<Integer, IFunction<Integer, Integer>> add = x -> y -> x + y;

}
