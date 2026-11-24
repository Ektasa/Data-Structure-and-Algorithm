class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
     
        combinationsHelper(0,candidates, target, new ArrayList<Integer>(),ans);

        return ans;
    }
    
    public void combinationsHelper(int i,int[] candidates, int target, List<Integer> ds,  List<List<Integer>> ans)
    {
        if(i==candidates.length){
        if(target==0)
        {
            ans.add(new ArrayList<>(ds));
        }
            return;
        }
       if(candidates[i]<=target){
        ds.add(candidates[i]);
        combinationsHelper(i,candidates,target-candidates[i],ds,ans);
        ds.remove(ds.size()-1);
         
        }
         combinationsHelper(i+1,candidates,target,ds,ans);
        
    }


}