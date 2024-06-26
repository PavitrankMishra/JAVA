package TODO;

public class Q9_String_Rotated_By_2_Places {
    public static boolean rotate(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }

        if(str1.length() == 1) {
            if(str1.charAt(0) == str2.charAt(0)) {
                return true;
            }else {
                return false;
            }
        }

        String clockwise = str1.substring(str1.length()-2) + str1.substring(0,str1.length()-2);
        String antiClockwise = str1.substring(2) + str1.substring(0,2);
        if(str2.equals(clockwise) || str2.equals(antiClockwise)) {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str1 = "amazon";
        String str2 = "azonam";
        boolean res = rotate(str1,str2);
        System.out.println(res);
    }
}
