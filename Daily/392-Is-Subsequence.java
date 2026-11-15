class Solution {
    public boolean isSubsequence(String s, String t) {
      int n1=s.length(); int n2=t.length();
      int res=0; 
    //   for(int i=0;i<n2;i++)
    //   {
    //     int j=0;
    //     while(j<n1)
    //     {
    //         if(s.charAt(j)==t.charAt(i))
    //         {
    //             res++;
    //         }
    //         j++;
    //     }

    //   }
int si=0; int ti=0;
while(si<n1 && ti<n2)
{
    if(s.charAt(si)==t.charAt(ti))
    {
        si++;
    }ti++;
}
  if(si==n1){
        return true;
      }
      return false;
    }
    
   

}