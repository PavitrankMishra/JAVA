package TODO;

public class Q4_Minimum_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = new int[] {4,5,1,2,3};
        int start = 0;
        int end = nums.length-1;
        while(start < end) {
            int mid = (start+end)/2;
            if(nums[mid] < nums[end]) {
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        System.out.println(nums[start]);
    }
}
