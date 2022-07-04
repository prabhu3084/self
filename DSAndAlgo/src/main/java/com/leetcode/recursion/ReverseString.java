package com.leetcode.recursion;

/*
https://leetcode.com/problems/reverse-string/

 */
public class ReverseString {

    public void reverseString(char[] s) {

        reverseString(s, 0, s.length -1);

    }

    public void reverseString(char[] s, int p, int r) {

        if (p < r) {
            char temp = s[r];
            s[r] = s[p];
            s[p] = temp;
            reverseString(s, p + 1, r - 1);
        }
    }
}
