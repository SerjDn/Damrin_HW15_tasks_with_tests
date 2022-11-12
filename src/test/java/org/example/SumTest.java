package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumTest {

    private Sum sum;

    @Before
    public void init() {
        sum = new Sum();
    }

    @Test
    public void twoSumFirstTest() {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = {0, 1};

        Assert.assertEquals(result, sum.twoSum(nums, target));
    }

    @Test
    public void twoSumSecondTest() {
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = {1, 2};

        Assert.assertEquals(result, sum.twoSum(nums, target));
    }

    @Test
    public void twoSumThirdTest() {
        int[] nums = {3,3};
        int target = 6;
        int[] result = {0, 1};

        Assert.assertEquals(result, sum.twoSum(nums, target));
    }
}
