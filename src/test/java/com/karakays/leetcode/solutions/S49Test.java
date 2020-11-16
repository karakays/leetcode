package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class S49Test {

    S49 s49 = new S49();

    @Test
    public void test1() {
        String[] in = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res = s49.groupAnagrams(in);
        Assert.assertEquals(3, res.size());
    }

    @Test
    public void test2() {
        String[] in = {""};
        List<List<String>> res = s49.groupAnagrams(in);
        Assert.assertEquals(1, res.size());
    }

    @Test
    public void test3() {
        String[] in = {"a"};
        List<List<String>> res = s49.groupAnagrams(in);
        Assert.assertEquals(1, res.size());
    }
}
