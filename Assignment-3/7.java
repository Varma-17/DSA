import java.util.*;
class Solution
{
    public List<List<Integer>> findMissingRanges(int[] nums,int lower,int upper)
    {
        List<List<Integer>> res=new ArrayList<>();

        if(nums.length==0)
        {
            res.add(Arrays.asList(lower,upper));
            return res;
        }
        int start=lower;
        if(start<nums[0])
        {
            res.add(Arrays.asList(start,nums[0]-1));
            start=nums[0]+1;
        }
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]-nums[i-1]>1)
            {
                res.add(Arrays.asList(nums[i-1]+1,nums[i]-1));
            }
        }

        if(nums[nums.length-1]<upper)
        {
            res.add(Arrays.asList(nums[nums.length-1]+1,upper));
        }

        return res;
    }
}
