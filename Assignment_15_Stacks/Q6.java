import java.util.*;

public class Main
{
	public static void main(String[] args)
    {
        String str="123+*8-";
        
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))
            {
                s.push(str.charAt(i)-'0');
            }
            else if(str.charAt(i)=='*')
            {
                int a=s.pop(),b=s.pop();
                int res=b*a;
                s.push(res);
            }
            else if(str.charAt(i)=='+')
            {
                int a=s.pop(),b=s.pop();
                int res=b+a;
                s.push(res);
            }
            else if(str.charAt(i)=='-')
            {
                int a=s.pop(),b=s.pop();
                int res=b-a;
                s.push(res);
            }
            else
            {
                int a=s.pop(),b=s.pop();
                int res=b/a;
                s.push(res);
            }
        }
        
        System.out.println(s.pop());
    }
}
