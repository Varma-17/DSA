class Solution
{
    public static int max(int[] arr,int i)
    {
        if(i==arr.length-1)
        {
            return arr[i];
        }
        
        int nextMax = max(arr,i+1);
        
        return Math.max(arr[i],nextMax);
    }
}
