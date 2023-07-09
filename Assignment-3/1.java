class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int min=Integer.MAX_VALUE;
        int close=0;
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            
            while(j<k)
            {
                int sum =nums[i]+nums[j]+nums[k];
                if(sum > target)
                {
                    k--;
                }
                else if(sum < target)
                {
                    j++;
                }
                else
                {
                    return sum;
                }
                if(Math.abs(sum-target)<min)
                {
                    min=Math.abs(sum-target);
                    close=sum;
                }
            }
        }
        
        return close;
    }
}
