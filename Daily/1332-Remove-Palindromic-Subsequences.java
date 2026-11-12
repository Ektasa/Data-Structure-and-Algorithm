class Solution {
    public int removePalindromeSub(String s) {
        int i=0, n=s.length();
        while(i<=n/2)
        {
            if(s.charAt(i)!=s.charAt(n-1-i++)) return 2;

        }
        return 1;
    }
}