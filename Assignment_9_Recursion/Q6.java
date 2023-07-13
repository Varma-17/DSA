class Main
{
    public static int ap(int a,int d,int n)
    {
        if(n==1)
        {
            return a;
        }
        return ap(a+d,d,n-1);
    }
}
