class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j=0;
        int k=n;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                res[i]=nums[j];
                j++;
            }
            else
            {
                res[i]=nums[k];
                k++;
            }
        }
        return res;
    }
}
