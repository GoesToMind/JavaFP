package com.vitor.fp;

public class Example04 {

    public static IFunction<IFunction<Integer, Integer>,
            IFunction<IFunction<Integer, Integer>,
                    IFunction<Integer, Integer>>> compose = x -> y -> z -> x.apply(y.apply(z));
}
