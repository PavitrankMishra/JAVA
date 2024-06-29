package com.company.String;

import java.util.ArrayList;
import java.util.*;
public class S6_Palindromic_Substrings {
    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        boolean isPalindrome = true;
        while(l<=r) {
            if(s.charAt(l) != s.charAt(r)) {
                isPalindrome = false;
                return isPalindrome;
            }
            l++;
            r--;
        }

        return isPalindrome;
    }
    public static void main(String[] args) {
        String s = "abccbc";
        List<String> s1 = new ArrayList<String>();
        HashMap<String, Integer> m1 = new HashMap<String, Integer>();
        for(int i=0;i<s.length();i++) {
            for(int j=i+1;j<=s.length();j++) {
                String res = s.substring(i,j);
                if(isPalindrome(res) == true) {
                    s1.add(res);
                    m1.put(res, res.length());
                }
            }
        }

        int max_Length = 0;
        String ans = "";

        for(String key:m1.keySet()) {
            if(m1.get(key) > max_Length) {
                ans = key;
                max_Length = m1.get(key);
            }
//            System.out.println(m1.get(key));
            }
        System.out.println(ans);
        }
    }
