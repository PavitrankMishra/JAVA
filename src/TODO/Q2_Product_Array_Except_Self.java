package TODO;

public class Q2_Product_Array_Except_Self {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4};
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        prefix[0] = 1;
        for(int i=1;i<nums.length;i++) {
            prefix[i] = prefix[i-1]*nums[i-1];
        }

        suffix[suffix.length-1] = 1;
        for(int j=suffix.length-2;j>=0;j--) {
            suffix[j] = suffix[j+1] * nums[j+1];
        }
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            ans[i] = prefix[i] * suffix[i];
        }

        for(int e:ans) {
            System.out.print(e + " ");
        }
    }
}
