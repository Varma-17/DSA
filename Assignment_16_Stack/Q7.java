import java.util.*;
public class Main
{
    public static int LS(String[] arr)
    {
        Stack<String> st=new Stack<>();
        
        for(String i:arr)
        {
            if(!st.isEmpty() && st.peek().equals(i))
            {
                st.pop();
            }
            else{
                st.push(i);
            }
            
        }
        
        return st.size();
    }
    
	public static void main(String[] args) {
		String[] arr={"ab","aa","aa","bcd","ab"};
		
		int res=LS(arr);
		System.out.println(res);
	}
}
