import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
        String str="java";
        
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        
        String rev="";
        
        while(!s.isEmpty())
        {
            rev=rev+s.pop();
        }

        System.out.println(rev);
    }
}
