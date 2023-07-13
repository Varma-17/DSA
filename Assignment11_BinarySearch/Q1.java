class Solution {
    public int mySqrt(int x) {
        if(x==0)
        {
            return 0;
        }
        int l=1;
        int r=x;
        while(l<r)
        {
            int mid=(l+r)/2;
            if(mid<=x/mid && (mid+1)>x/(mid+1))
            {
                return mid;
            }
            else if(mid > x/mid)
            {
                r=mid;
            }
            else
            {
                l=mid+1;
            }
        }
        return l;
    }
}
