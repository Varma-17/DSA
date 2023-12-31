class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;

        while(l<r)
        {
            int mid=(l+r)/2;
            if(mid>0 && nums[mid]<nums[mid-1])
            {
                return nums[mid];
            }
            else if(nums[mid]>=nums[l] && nums[mid]>nums[r])
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return nums[l];
    }
}
