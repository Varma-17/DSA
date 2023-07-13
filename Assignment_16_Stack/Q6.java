import java.util.*;
public class Main
{
    public static void reverseFirstK(Queue<Integer> q,int k)
    {
        Deque<Integer> d=new ArrayDeque<>();
        
        for(int i=0;i<k;i++)
        {
            d.push(q.poll());
        }
        
        while(!d.isEmpty())
        {
            q.add(d.pop());
        }
        
        for(int i=0;i<q.size()-k;i++)
        {
            q.add(q.poll());
        }
    }
    
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
 
        int k = 5;

        reverseFirstK(q, k);
        
        while(!q.isEmpty())
        {
            System.out.print(q.peek() + " ");
            q.poll();
        }
		
	}
}
