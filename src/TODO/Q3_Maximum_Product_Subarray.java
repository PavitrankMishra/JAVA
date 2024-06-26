package TODO;


//Leetcode - https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class Q3_Maximum_Product_Subarray {
    public static void main(String[] args) {
        int[] arr = new int[] {6, -3, -10, 0, 2};
        long ans = arr[0];
        long ma = ans;
        long mi = ans;

        for(int i=1;i<arr.length;i++) {
            if(arr[i] < 0) {
                long temp = ma;
                ma = mi;
                mi = temp;
            }
            ma = Math.max(ma*arr[i+1], ma);
            mi = Math.min(mi*arr[i+1], mi);
            ans = Math.max(ma, ans);
        }

        System.out.println("The maximum product subarray is: " + ans);
    }
}
