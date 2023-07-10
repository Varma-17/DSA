class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res=new int[n][n];
        int left=0;
        int right=n-1;
        int up=0;
        int down=n-1;

        int k=1;
        while(up<=down && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                res[up][i]=k++;
            }
            up++;
            for(int i=up;i<=down;i++)
            {
                res[i][right]=k++;
            }
            right--;
            for(int i=right;i>=left;i--)
            {
                res[down][i]=k++;
            }
            down--;
            for(int i=down;i>=up;i--)
            {
                res[i][left]=k++;
            }
            left++;
        }
        return res;
    }
}
