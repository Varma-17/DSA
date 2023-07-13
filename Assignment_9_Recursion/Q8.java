class Main
{
    public static int permute(int[] arr,int i)
    {
        if(i==arr.length)
        {
            return arr[i-1];
        }
        arr[i] = arr[i-1]*arr[i];
        return permute(arr,i+1);
    }
}
