/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        return partition(lists,0,lists.length-1);
    }

    public static ListNode partition(ListNode[] lists,int s,int e)
    {
        if(s==e) return lists[s];
        if(s<e)
        {
            int q=s+(e-s)/2;
            ListNode l1=partition(lists,s,q);
            ListNode l2=partition(lists,q+1,e);
            return merge(l1,l2);
        }
        else
        {
            return null;
        }
    }

    public static ListNode merge(ListNode l1,ListNode l2)
    {
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val<l2.val)
        {
            l1.next=merge(l1.next,l2);
            return l1;
        }
        else
        {
            l2.next=merge(l1,l2.next);
            return l2;
        }
    }
}
