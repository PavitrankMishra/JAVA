package com.company.String;

import java.util.ArrayList;
import java.util.*;
public class S2_Longest_Substring_Without_Repeating_Character {
    public static void main(String[] args) {
        int start = 0;
        int end = 0;
        int max_length = 0;
        String a = "abcabb";
        List<Character> set1 = new ArrayList<Character>();
        while(end < a.length()) {
            if(!set1.contains(a.charAt(end))) {
                set1.add(a.charAt(end));
                end++;
                max_length = Math.max(max_length, set1.size());
            }else {
                set1.remove(Character.valueOf(a.charAt(start)));
                start++;
            }
        }
        System.out.println(max_length);
        return;
    }
}
