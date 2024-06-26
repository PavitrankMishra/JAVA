package TODO;

//import sun.security.pkcs11.wrapper.CK_SSL3_KEY_MAT_OUT;

import java.util.*;
public class Q8_Check_For_Subsequence {
    public static void main(String[] args) {
        String A = "AXY";
        String B = "YADXCP";
        if(A.length() == 0) {
            System.out.println("True");
            return;
        }

        int i= 0;
        int j = 0;

        while(i< A.length() && j< B.length()) {
            if(A.charAt(i) == B.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        if(i == A.length()) {
            System.out.println("True");
            return;
        }

        System.out.println("False");
    }
}
