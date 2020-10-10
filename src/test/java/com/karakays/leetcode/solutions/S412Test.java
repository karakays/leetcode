package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class S412Test {

    S412 s412 = new S412();

    @Test
    public void test1() {
        List<String> exp = Arrays.asList( "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
    "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");

        Assert.assertEquals(exp, s412.fizzBuzz(15));
    }


}
