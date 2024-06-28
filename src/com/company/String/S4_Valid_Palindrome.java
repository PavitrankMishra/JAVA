package com.company.String;

public class S4_Valid_Palindrome {
    public static void main(String[] args) {
        int x = 121;
        int oriNum = 121;
        int res = 0;
        while(x>0) {
            int digit = x%10;
            res = res*10 + digit;
            x/=10;
        }

        if(oriNum == res) {
            System.out.println("Palindrome");
            return;
        }else {
            System.out.println("Not a Palindrome");
            return;
        }
    }
}
