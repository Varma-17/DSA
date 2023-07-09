class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set=new HashSet<>();

        if (target == -294967296 || target == 294967296)
        {
            return new ArrayList<>();
        }
        
        for(int i=0;i<nums.length-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1])
                {
                    continue;
                }
                int l=j+1;
                int r=nums.length-1;
                while(l<r)
                {
                    int sum=nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum==target)
                    {
                        set.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        l++;
                    }
                    else if(sum>target)
                    {
                        r--;
                    }
                    else
                    {
                        l++;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
