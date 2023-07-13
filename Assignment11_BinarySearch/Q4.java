class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int l=1;
        int r=nums.length-1;
        while(l<r)
        {
            int mid=(l+r)/2;
            int count=0;
            for(int num : nums)
            {
                if(num<=mid)
                {
                    count++;
                }
            }
            if(count<=mid)
            {
                l=mid+1;
            }
            else
            {
                r=mid;
            }
        }
        return l;
    }
}
