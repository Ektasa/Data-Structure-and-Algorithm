class Solution {
    public int longestSubarray(int[] nums) {
        int i=0; int max=0;
       while(i<nums.length)
        {
            int count=0;
            while(nums[i]+nums[i+1]==nums[i+2])
            {
                count++; i++;
            }
            i++;
            max=Math.max(count,max);
        }
        return max;
    }
}