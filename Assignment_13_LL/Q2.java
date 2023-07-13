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
  
	void removeDup()
	{
	    Node h1=head;
	    Node cur=head.next;
	    
	    while(cur!=null)
	    {
	        if(h1.data==cur.data)
	        {
	            h1.next=cur.next;
	            cur=h1.next;
	        }
	        else
	        {
	            h1=cur;
	            cur=h1.next;
	        }
	    }
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
		
		llist.head=new Node(1);
		
		Node second=new Node(1);
		Node third=new Node(1);
		Node fourth=new Node(2);
		Node fifth=new Node(3);
		Node sixth=new Node(3);
		
		llist.head.next = second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;*/
		
		llist.removeDup();
		
		llist.print();
	}
}
