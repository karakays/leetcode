package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Test;

public class S3Test {

    S3 s3 = new S3();

    @Test
    public void test1() {
        Assert.assertEquals(3, s3.lengthOfLongestSubstring("abcabcbb"));
    }


    @Test
    public void test2() {
        Assert.assertEquals(1, s3.lengthOfLongestSubstring("bbbb"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(3, s3.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(0, s3.lengthOfLongestSubstring(""));
    }

    @Test
    public void test5() {
        Assert.assertEquals(3, s3.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    public void test6() {
        Assert.assertEquals(6, s3.lengthOfLongestSubstring("abcbyzeabc"));
    }

    @Test
    public void test7() {
        Assert.assertEquals(5, s3.lengthOfLongestSubstring("abcbyzbeabc"));
    }

}
