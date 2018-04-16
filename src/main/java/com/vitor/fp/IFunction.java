package com.vitor.fp;

public interface IFunction<T, U> {
    U apply(T arg);
}
