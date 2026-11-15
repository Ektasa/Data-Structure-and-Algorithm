class Solution {
    public boolean isSubsequence(String s, String t) {
      int n1=s.length(); int n2=t.length();
    int si=0; int ti=0;
    while(si<n1 && ti<n2)
    {
        if(s.charAt(si)==t.charAt(ti))
        {
            si++;
        }ti++;
    }
    return si==n1;
    }
        
   

}