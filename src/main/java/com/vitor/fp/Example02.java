package com.vitor.fp;

public class Example02 {

    public static IFunction<Integer, Integer> compose(
            final IFunction<Integer, Integer> f1,
            final IFunction<Integer, Integer> f2
    ) {
        return arg -> f1.apply(f2.apply(arg));
    }
    
}
