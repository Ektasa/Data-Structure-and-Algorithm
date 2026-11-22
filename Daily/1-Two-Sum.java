class Solution {
    public int[] twoSum(int[] nums, int target) {

HashMap<Integer,Integer> map=new HashMap<>();
 int[] n1=new int[2];
 for(int right=0;right<nums.length;right++)
 {
    int comp=target-nums[right];

    if(map.containsKey(comp))
    {
        n1[0]=map.get(comp); 
        n1[1]=right;
    }
  map.put(nums[right],right);
    
 }  return n1;    
    }
}