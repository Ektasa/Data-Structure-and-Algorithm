class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] num2=new int[n];
         Arrays.fill(num2,1);
       
        int res=1;
        for(int i=0;i<n;i++)
        {
          num2[i]*=res;
          res*=nums[i];
        }
          res=1;
          for(int i=n-1;i>=0;i--){
            num2[i]*=res;
            res*=nums[i];
        }
        return num2;
    }
}