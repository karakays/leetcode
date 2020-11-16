package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S17Test {

    S17 s17 = new S17();

    @Test
    public void test1() {
        List<String> exp = Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf");
        List<String> out = s17.letterCombinations("23");
        Collections.sort(exp);
        Collections.sort(out);
        Assert.assertEquals(exp, out);
    }

    @Test
    public void test2() {
        List<String> exp = Arrays.asList();
        List<String> out = s17.letterCombinations("");
        Collections.sort(exp);
        Collections.sort(out);
        Assert.assertEquals(exp, out);
    }

    @Test
    public void test3() {
        List<String> exp = Arrays.asList("w", "x", "y", "z");
        List<String> out = s17.letterCombinations("9");
        Collections.sort(exp);
        Collections.sort(out);
        Assert.assertEquals(exp, out);
    }


}
