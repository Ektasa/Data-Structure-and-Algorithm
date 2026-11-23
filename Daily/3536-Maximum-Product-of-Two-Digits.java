class Solution {
    public int maxProduct(int n) {
        int n1=n; int m1=-1; int m2=-1;
         while(n1>0)
         {
            int t=n1%10;
            if(m1<=t)
            {
                m2=m1;
                m1=t;
            }
            else if(t>m2 && t!=m1)
            {
                m2=t;
            }
            n1=n1/10;
           
         }
         return m1*m2;
    }
}