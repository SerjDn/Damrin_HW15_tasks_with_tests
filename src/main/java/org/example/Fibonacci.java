package org.example;

//https://leetcode.com/problems/fibonacci-number/

public class Fibonacci {

    public int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
