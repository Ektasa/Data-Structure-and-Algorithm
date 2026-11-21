class Solution {
    public int maxSubArray(int[] nums) {
        int left=0;  int sum=0; int maxsum=nums[0];
        for(int n:nums)
        {
            if(sum<0) sum=0;
            sum+=n;
            maxsum=Math.max(sum,maxsum);

        }
      
        return maxsum;
    }
}