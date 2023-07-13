class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length()+1;
        int[] res=new int[n];
        int start=0;
        int end=n-1;
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)=='I')
            {
                res[i]=start;
                start++;
            }
            else
            {
                res[i]=end;
                end--;
            }
        }
        res[n-1]=start;
        return res;
    }
}
