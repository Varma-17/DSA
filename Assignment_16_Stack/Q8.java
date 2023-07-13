import java.util.*;
public class Main
{
    public static void LS(int[] arr,int[] L)
    {
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        
        
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && st.peek() >= arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                L[i]=st.peek();
            }
            else
            {
                L[i]=0;
            }
            st.push(arr[i]);
        }
    }
    
    public static void rev(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    
	public static void main(String[] args) {
		int[] arr={2,1,8};
		int n=arr.length;
		int[] ls=new int[n];
		int[] rs=new int[n];
		LS(arr,ls);
		rev(arr);
		LS(arr,rs);
		
		int res=-1;
		
		for(int i=0;i<n;i++)
		{
		    res=Math.max(res,Math.abs(ls[i]-rs[n-i-1]));
		}
		
		System.out.println(res);
	}
}
