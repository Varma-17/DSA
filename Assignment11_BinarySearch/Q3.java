class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]==mid)
            {
                l=mid+1;
            }
            else if(nums[mid]>mid)
            {
                r=mid-1;
            }
        }
        return l;
    }
}
