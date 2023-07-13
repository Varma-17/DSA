class Solution {
    public int bs(int[] nums,int t,int left)
    {
        int res=-1;
        int l=left;
        int r=nums.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]==t)
            {
                res=mid;
                r=mid-1;
            }
            else if(nums[mid]<t)
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
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> res=new ArrayList<>();
        int l=0;
        for(int i=0;i<nums1.length;i++)
        {
            int idx=bs(nums2,nums1[i],l);
            if(idx!=-1)
            {
                res.add(nums1[i]);
                l=idx+1;
            }
        }
        return res.stream().mapToInt(i->i).toArray();
    }
}
