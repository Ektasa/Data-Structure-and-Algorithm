class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        HashSet<ArrayList<Integer>> hash=new HashSet<>();
       // List<List<Integer>> list=new ArrayList<>();
       for(int i=0;i<n-2;i++)
       {
        int left=i+1; int right=n-1;
        while(left<right)
        {
            int sum=nums[i]+nums[left]+nums[right];
            if(sum==0)
            {
                ArrayList<Integer> ll=new ArrayList<>();
                 ll.add(nums[i]);   ll.add(nums[left]);  ll.add(nums[right]); 
                hash.add(ll);
                left++; right--;
               
            }
            else if(sum<0)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
     //  list.add(hash);
       
        }
       return new ArrayList<>(hash); 
     //return list;
    }
}