class Solution {
    public int longestSubarray(int[] nums) {
        if(nums.length<=2) return nums.length;
       int max=2;int count=2;
      for(int i=2;i<nums.length;i++)
        {
             
            if(nums[i]==nums[i-1]+nums[i-2])
            {
                count++; 
            }
            else
            {
                count=2;
            }
           
            max=Math.max(count,max);
        }
        return max;
    }
}