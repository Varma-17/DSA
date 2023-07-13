class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length-1;

        while(l<r)
        {
            int mid=(l+r)/2;
            int mid2=mid+1;
            if(nums[mid]<nums[mid2])
            {
                l=mid2;
            }
            else
            {
                r=mid;
            }
        }
        return l;
    }
}
