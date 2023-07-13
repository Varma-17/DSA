import java.util.*;

public class Main
{
    public static int[] next(int[] arr)
    {
        Stack<Integer> st=new Stack<>();
        
        int[] res=new int[arr.length];
        Arrays.fill(res,-1);
        
        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty())
            {
                if(st.peek()>=arr[i])
                {
                    st.pop();
                }
                else
                {
                    res[i]=st.peek();
                    break;
                }
            }
            st.push(arr[i]);
        }
        
        return res;
    }
	public static void main(String[] args) {
		int[] res = next(new int[]{1,5,0,3,4,5});
		for(int i=0;i<res.length;i++)
		{
		    System.out.println(res[i]);
		}
	}
}
