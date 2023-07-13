import java.util.*;

public class Main
{
	public static void insertAtBottom(Stack<Integer> s,int item)
	{
		if(s.isEmpty())
		{
			s.push(item);
			return;
		}

		int top=s.pop();
		insertAtBottom(s,item);

		s.push(top);
	}
    
	public static void reverseStack(Stack<Integer> stack) {
		if(stack.isEmpty())
		{
			return;
		}

		int item=stack.pop();
		reverseStack(stack);

		insertAtBottom(stack,item);
	}
	
	public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        for (int i = 1; i <= 5; i++) {
            s.push(i);
        }
 
        System.out.println("Original stack is " + s);
        reverseStack(s);
        System.out.println("Reversed stack is " + s);
    }
}
