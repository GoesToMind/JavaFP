package com.vitor.fp;

public class Example01 {

    public static IFunction<Integer, Integer> compose(
            IFunction<Integer, Integer> f1,
            IFunction<Integer, Integer> f2
    ) {
        return new IFunction<Integer, Integer>() {
            public Integer apply(Integer arg) {
                return f1.apply(f2.apply(arg));
            }
        };
    }
    
}
