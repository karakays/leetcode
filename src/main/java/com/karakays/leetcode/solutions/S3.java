package com.karakays.leetcode.solutions;

public class S3 extends Base {

    public int lengthOfLongestSubstring(String s) {
        char[] array = s.toCharArray();
        int maxLength = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0, globalStart = 0; i < array.length; i++) {
            int charIndex = stringBuilder.toString().indexOf(array[i]);
            if(charIndex == -1) {
                stringBuilder.append(array[i]);
                if(stringBuilder.length() > maxLength) {
                    maxLength = stringBuilder.length();
                }
            } else {
                stringBuilder.setLength(0);
                i = globalStart + charIndex;
                globalStart = globalStart + charIndex + 1;
            }
        }
        return maxLength;
    }
}
