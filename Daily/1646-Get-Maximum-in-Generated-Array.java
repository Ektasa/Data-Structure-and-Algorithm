class Solution {
    public int getMaximumGenerated(int n) {
        
        int[] nums=new int[n+1];
        int max=0;
        if(n==0) return 0;
        if(n==1) return 1;

        nums[0]=0; nums[1]=1;
        int j=1;

        for(int i=2;i<=n;i++)
        {
            if(i%2==0)
            {
                nums[i]=nums[j];
                max=Math.max(nums[i],max);j++;
            }
            else{
                nums[i]=nums[j]+nums[j-1];
            max=Math.max(nums[i],max);
            }
        }
        return max;
    }
}