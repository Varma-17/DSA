class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int i=nums.length-1;

        int res[]=new int[nums.length];

        while(l<=r)
        {
            int leftSum=nums[l]*nums[l];
            int rightSum=nums[r]*nums[r];

            if(rightSum>leftSum)
            {
                res[i]=rightSum;
                r--;
            }
            else
            {
                res[i]=leftSum;
                l++;
            }
            i--;
        }

        return res;
    }
}
