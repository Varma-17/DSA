class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy, cur = dummy, nex = dummy;
        int count = 0;
        while (cur.next != null) {
            cur = cur.next;
            count++;
        }

        while (count >= k) {
            cur = pre.next;
            nex = cur.next;
            for (int i = 1; i < k; i++) {
                cur.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = cur.next;
            }

            pre = cur;
            count -= k;
        }
        
        while(count!=0)
        {
            cur=pre.next;
            nex=cur.next;
            for(int i=1;i<count;i++)
            {
                cur.next=nex.next;
                nex.next=pre.next;
                pre.next=nex;
                nex=cur.next;
            }
            break;
        }

        return dummy.next;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create the input list: [1, 2, 3, 4, 5, 6, 7, 8]
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

        int k =3;

        Solution solution = new Solution();
        ListNode result = solution.reverseKGroup(head, k);

        // Print the resulting list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
