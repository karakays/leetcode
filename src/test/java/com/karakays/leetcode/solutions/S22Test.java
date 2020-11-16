package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S22Test {

    S22 s22 = new S22();

    @Test
    public void test1() {
        List<String> exp = Arrays.asList("((()))","(()())","(())()","()(())","()()()");
        List<String> out = s22.generateParenthesis(3);
        Collections.sort(exp);
        Collections.sort(out);
        Assert.assertEquals(exp, out);
    }

    @Test
    public void test2() {
        List<String> exp = Arrays.asList("()");
        List<String> out = s22.generateParenthesis(1);
        Collections.sort(exp);
        Collections.sort(out);
        Assert.assertEquals(exp, out);
    }

    @Test
    public void test3() {
        List<String> exp = Arrays.asList("(())", "()()");
        List<String> out = s22.generateParenthesis(2);
        Collections.sort(exp);
        Collections.sort(out);
        Assert.assertEquals(exp, out);
    }


}
