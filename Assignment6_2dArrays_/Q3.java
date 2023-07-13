class Solution {
    public boolean validMountainArray(int[] arr) {
        int l=0;
        int r=arr.length-1;
        int n=arr.length;
        while((l+1)<n && arr[l]<arr[l+1])
        {
            l++;
        }
        while((r-1)>0 && arr[r]<arr[r-1])
        {
            r--;
        }
        return l>0 && l==r && r<n-1;
    }
}
