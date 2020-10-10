package com.karakays.leetcode.solutions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.logging.Logger;

public class S384Test {
    private final static Logger LOG = Logger.getLogger(S384Test.class.getName());

    S384 s384;
    int i[];

    @Before
    public void init() {
        i = new int[]{1, 2, 3, 4, 5};
        s384 = new S384(i);
    }

    @Test
    public void test1() {
        int[] s = s384.shuffle();
        LOG.info(String.format("Shuffled array=%s", Arrays.toString(s)));
        Assert.assertEquals(s.length, i.length);
        Arrays.sort(s);
        Assert.assertArrayEquals(i, s);
        int[] reset = s384.reset();
        Assert.assertArrayEquals(i, reset);
    }

    @Test
    public void test2() {
        int[] i = new int[]{1};
        s384 = new S384(i);
        int[] s = s384.shuffle();
        LOG.info(String.format("Shuffled array=%s", Arrays.toString(s)));
        Assert.assertEquals(s.length, i.length);
        Arrays.sort(s);
        Assert.assertArrayEquals(i, s);
        int[] reset = s384.reset();
        Assert.assertArrayEquals(i, reset);
    }

}
