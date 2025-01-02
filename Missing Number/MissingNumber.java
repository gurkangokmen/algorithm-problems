// https://leetcode.com/problems/missing-number/description/?envType=problem-list-v2&envId=binary-search

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        Arrays.sort(nums);

        int result = 0;
        
        for (int i = 0; i <= n; i++) {
            if (nums[i]!=i) {
                result = i;
            }
        }

        return result;
    }
}
