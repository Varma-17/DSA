class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int m=s1.length(),n=s2.length();
        int preSum1[]=new int[m];
        int preSum2[]=new int[n];

        for(int i=0;i<m;i++)
        {
            if(i==0)
            {
                preSum1[i]=s1.charAt(i);
            }
            else
            {
                preSum1[i] = preSum1[i-1]+s1.charAt(i);
            }
        }

        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                preSum2[i]=s2.charAt(i);
            }
            else
            {
                preSum2[i] = preSum2[i-1]+s2.charAt(i);
            }
        }

        int dp[][] = new int[m][n];

        for(int i[]:dp)
        {
            Arrays.fill(i,-1);
        }

        return helper(s1,s2,m-1,n-1,preSum1,preSum2,dp);
    }

    public int helper(String s1,String s2,int m,int n,int[] preSum1,int[] preSum2,int[][] dp)
    {
        if(m<0 && n<0)
        {
            return 0;
        }
        if(m<0)
        {
            return preSum2[n];
        }
        if(n<0)
        {
            return preSum1[m];
        }
        if(dp[m][n]!=-1)
        {
            return dp[m][n];
        }

        if(s1.charAt(m)==s2.charAt(n))
        {
            return dp[m][n]=helper(s1,s2,m-1,n-1,preSum1,preSum2,dp);
        }
        else
        {
            return dp[m][n]= Math.min((s1.charAt(m)+helper(s1,s2,m-1,n,preSum1,preSum2,dp)),(s2.charAt(n)+helper(s1,s2,m,n-1,preSum1,preSum2,dp)));
        }
    }
}
