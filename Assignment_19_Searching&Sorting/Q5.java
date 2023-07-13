class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res=new int[nums.length];
        int l=1;
        int r=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                res[r]=nums[i];
                r+=2;
            }
            else
            {
                res[l]=nums[i];
                l+=2;
            }
        }

        return res;
    }
}
