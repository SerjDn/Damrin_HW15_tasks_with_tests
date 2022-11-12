package org.example;

import java.util.Arrays;

public class Main {

    public static final String SEPARATOR = "=================================================================";

    public static void main(String[] args) {
        System.out.println("Two Sum:");
        int[] nums = {2,7,11,15};
        int target = 9;
        Sum sum = new Sum();
        System.out.println(Arrays.toString(sum.twoSum(nums, target)) + "\n" + SEPARATOR);

        System.out.println("Fibonacci Number:");
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fib(4) + "\n" + SEPARATOR);

        System.out.println("Pascal's Triangle:");
        Triangle triangle = new Triangle();
        System.out.println(triangle.generate(5));
    }
}
