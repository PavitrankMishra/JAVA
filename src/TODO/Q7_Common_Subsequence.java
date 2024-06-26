package TODO;

import java.util.*;
public class Q7_Common_Subsequence {
    public static void main(String[] args) {
        String a = "ABEF";
        String b = "CADE";
        LinkedHashSet<Character> set1 = new LinkedHashSet<Character>();
        String res = "";
        for(int i=0;i<a.length();i++) {
            set1.add(a.charAt(i));
        }

        for(int j=0;j<b.length();j++) {
            if(set1.contains(b.charAt(j))){
                res += b.charAt(j);
            }
        }
        if(res.length() > 0) {
            System.out.println("True");
            return;
        }else {
            System.out.println("False");
            return;
        }
    }
}
