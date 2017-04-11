package com.lanxiang.exercise.reviewleet;

import org.junit.Test;

/**
 * Created by lanjing on 2017/4/4.
 */

/**
 * Given a string S, find the longest palindromic substring in S.
 * You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
 * <p>
 * 要求：给一个字符串，找出最长的回文子串，例如cabccba，它的回文子串是abccba
 */
public class _005 {


    public String longestPalindrome(String s) {
        if (s.isEmpty()) {
            return null;
        }
        if (s.length() == 0) {
            return s;
        }
        String result = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            String temp = getLongest(s, i, i);
            if (temp.length() > result.length()) {
                result = temp;
            }
            temp = getLongest(s, i, i + 1);
            if (temp.length() > result.length()) {
                result = temp;
            }
        }
        return result;
    }

    private String getLongest(String s, int left, int right) {
        while (left >= 0 && right <= s.length() - 1 && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    @Test
    public void run() {
        String s1 = "abcabc";
        String s2 = "xxzfefgabccbagfeasderwqwe";
        String s3 = "sadfxvagertdsgasdfaefojtiwqehrwebfasjdbkasvkdfahjsfdgweiuwqyeryqwyeryuiwuiuyiiuyiudasfhasdfb";
        System.out.println(longestPalindrome(s1));
        System.out.println(longestPalindrome(s2));
        System.out.println(longestPalindrome(s3));

    }
}
