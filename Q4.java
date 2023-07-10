class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=0;
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                sum++;
            }
            else
            {
                sum--;
            }
            if(map.containsKey(sum))
            {
                res=Math.max(res,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return res;
    }
}
