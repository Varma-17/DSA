class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        int preSum1[]=new int[m];
        int preSum2[]=new int[n];

        for(int i=0;i<m;i++)
        {
            preSum1[i]=i+1;
        }

        for(int i=0;i<n;i++)
        {
            preSum2[i]=i+1;
        }

        int dp[][]=new int[m][n];
        for(int i[] : dp)
        {
            Arrays.fill(i,-1);
        }

        return helper(m-1,n-1,word1,word2,preSum1,preSum2,dp);
    }

    public int helper(int m,int n,String word1,String word2,int[] preSum1,int[] preSum2,int[][] dp)
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

        if(word1.charAt(m)==word2.charAt(n))
        {
            return dp[m][n]=helper(m-1,n-1,word1,word2,preSum1,preSum2,dp);
        }
        else
        {
            return dp[m][n]= Math.min((1+helper(m-1,n,word1,word2,preSum1,preSum2,dp)),(1+helper(m,n-1,word1,word2,preSum1,preSum2,dp)));
        }
    }
}
