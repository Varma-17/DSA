class Solution
{
    public static int sum(int n,int total)
    {
        if(n==0)
        {
            return total;
        }
        return n+sum(n-1,total);
        
    }
}
