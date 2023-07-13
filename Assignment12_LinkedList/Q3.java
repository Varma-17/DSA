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
  
	void printNthFromLast(int N)
	{
		int len = 0;
		Node fast = head;
      	Node slow = head;
		
      	for(int i=2;i<N+1;i++)
        {
          fast=fast.next;
        }
      	if(fast==null)
        {
          System.out.println("-1");
        }
      	while(fast.next!=null)
        {
          fast=fast.next;
          slow=slow.next;
        }

		System.out.println(slow.data);
	}
  
	public static void main(String[] args)
	{
		LinkedList llist = new LinkedList();
		llist.head=new Node(1);
		
		Node second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
		
		llist.head.next = second;
		second.next=third;
		third.next=fourth;

		llist.printNthFromLast(4);
	}
}
