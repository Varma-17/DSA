class Solution {
    public boolean bs(int[] arr,int t)
    {
        int l=0;
        int r=arr.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==t)
            {
                return true;
            }
            else if(arr[mid]>t)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return false;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(i>0 && nums1[i-1]==nums1[i])
            {
                continue;
            }
            if(bs(nums2,nums1[i]))
            {
                res.add(nums1[i]);
            }
        }

        return res.stream().mapToInt(i->i).toArray();
    }
}
