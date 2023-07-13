import java.io.*;
public class LinkedList {
	public Node head;
  
	static class Node
  {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
  
	LinkedList merge(LinkedList llist2)
	{
	    
	    LinkedList res=new LinkedList();
	    
		Node h1=head;
		Node h2=llist2.head;
		
		Node h1next;
		Node h2next;
		
		if(h1.data>h2.data)
		{
		    res.head=new Node(h1.data);
		}
		else
		{
		    res.head=new Node(h2.data);
		}
		
		h1next=h1.next;
		h2next=h2.next;
		
		Node curr=res.head;
		
		while(h1next!=null && h2next!=null)
		{
		    if(h1next.data>h2next.data)
		    {
		        curr.next=h1next;
		    }
		    else
		    {
		        curr.next=h2next;
		    }
		    
		    h1next=h1next.next;
		    h2next=h2next.next;
		    
		    curr=curr.next;
		}
		
		return res;
	}
    
    void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
	public static void main(String[] args)
	{
		LinkedList llist = new LinkedList();
		llist.head=new Node(5);
		
		Node second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(8);
		
		llist.head.next = second;
		second.next=third;
		third.next=fourth;
		
		LinkedList llist2 = new LinkedList();
		llist2.head=new Node(1);
		
		second=new Node(7);
		third=new Node(4);
		fourth=new Node(5);
		
		llist2.head.next = second;
		second.next=third;
		third.next=fourth;

		LinkedList res = llist.merge(llist2);
		res.print();
		
	}
}
