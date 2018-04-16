# Java Functional Programming

Functional programs contain no assignment statements, so variables, once given a value, never change. More generally, functional programs contain no side effects at all. A function call can have no effect other than to compute its result. This eliminates a major source of bugs, and also makes the order of execution irrelevant — since no side effect can change an expression's value, it can be evaluated at any time. This relieves the programmer of the burden of prescribing the flow of control. Since expressions can be evaluated at any time, one can freely replace variables by their values and vice versa, that is, programs are "referentially transparent". This freedom helps make functional programs more tractable mathematically than their conventional counterparts.  **(John Hughes)** 


___
## A method can be functional if it respects the requirements of a pure function:
* It must not mutate anything outside the function. No internal mutation may be visible from the outside.
* It must not mutate its argument.
* It must not throw errors or exceptions.
* It must always return a value.
* When called with the same argument, it must always return the same result.

