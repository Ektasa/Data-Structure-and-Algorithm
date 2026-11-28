class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int res=0;
        if(x<0) return false;
        while(n>0)
        {
            res=res*10+n%10;
            n=n/10;
        }
        if(res==x)
        {
            return true;
        }
        return false;
}
}