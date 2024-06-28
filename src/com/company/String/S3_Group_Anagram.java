package com.company.String;

import java.util.Arrays;

public class S3_Group_Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        int n1 = ch1.length;
        int n2 = ch2.length;
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(n1 != n2){
            System.out.println("Not Anagram");
            return;
        }

        for(int i=0;i<n1;i++) {
            if(ch1[i] != ch2[i]) {
                System.out.println("False");
                return;
            }
        }

        System.out.println("True");
        return;
    }
}
