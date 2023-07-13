class Solution {
    public int bsFirst(int[] nums,int target)
    {
        int res=-1;
        int l=0;
        int r=nums.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]==target)
            {
                res=mid;
                r=mid-1;
            }
            else if(nums[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return res;
    }
    public int bsLast(int[] nums,int target)
    {
        int res=-1;
        int l=0;
        int r=nums.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]==target)
            {
                res=mid;
                l=mid+1;
            }
            else if(nums[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        res[0]=bsFirst(nums,target);
        res[1]=bsLast(nums,target);
        return res;
    }
}
