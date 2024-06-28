package TODO;

import java.util.*;
public class Three_Sum {
    public static long getHash(int x, int y, int z) {
        int hash = x;
        hash *= 100000;
        hash += y;
        hash *= 100000;
        hash += z;
        return hash;
    }
    public static void main(String[] args) {
        List<List<Integer>> l1 = new ArrayList();
        Set<Long> set1 = new HashSet<Long>();
        int target = 0;
        int[] nums = new int[] {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
            int newtar = target - nums[i];

            int l = i+1;
            int r = nums.length-1;

            while(l<r) {
                if(nums[l] + nums[r] < newtar) {
                    l++;
                } else if(nums[l] + nums[r] > newtar) {
                    r--;
                }else {
                    long hash = getHash(nums[i], nums[l], nums[r]);
                    if(set1.contains(hash) == false) {
                        l1.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        set1.add(hash);
                    }
                    l++;
                    r--;
                }
            }
        }

        System.out.println(l1);
    }
}
