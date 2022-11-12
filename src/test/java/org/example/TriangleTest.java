package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TriangleTest {

    private Triangle triangle;

    @Before
    public void init() {
        triangle = new Triangle();
    }

    @Test
    public void generateFirstTest() {
        int numRows = 5;
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(List.of(1)));
        result.add(new ArrayList<>(List.of(1, 1)));
        result.add(new ArrayList<>(List.of(1, 2, 1)));
        result.add(new ArrayList<>(List.of(1, 3, 3, 1)));
        result.add(new ArrayList<>(List.of(1, 4, 6, 4, 1)));

        Assert.assertEquals(result, triangle.generate(numRows));
    }

    @Test
    public void generateSecondTest() {
        int numRows = 1;
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();

        row.add(0, 1);
        result.add(new ArrayList<>(row));

        Assert.assertEquals(result, triangle.generate(numRows));
    }
}
