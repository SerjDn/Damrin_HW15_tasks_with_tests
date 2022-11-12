package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @Before
    public void init() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void fibFirstTest() {
        int num = 2;
        int result = 1;
        Assert.assertEquals(result, fibonacci.fib(num));
    }

    @Test
    public void fibSecondTest() {
        int num = 3;
        int result = 2;
        Assert.assertEquals(result, fibonacci.fib(num));
    }

    @Test
    public void fibThirdTest() {
        int num = 4;
        int result = 3;
        Assert.assertEquals(result, fibonacci.fib(num));
    }
}
