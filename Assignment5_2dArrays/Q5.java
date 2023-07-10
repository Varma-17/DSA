class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count=0;

        for(int i:arr1)
        {
            if(binarySearch(arr2,i-d,i+d))
            {
                count++;
            }
        }
        return count;
    }
    public static boolean binarySearch(int[] nums,int from,int to)
    {
        int l=0;
        int r=nums.length-1;

        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]>=from && nums[mid]<=to)
            {
                return false;
            }
            else if(nums[mid]<from)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
        }
        return true;
    }
}
