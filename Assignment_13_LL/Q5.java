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
    public ListNode removeDup(ListNode head, int t) {
    ListNode pre = null;
    ListNode cur = head;

    while (cur != null) {
        ListNode next = cur.next;
        cur.next = pre;
        pre = cur;
        cur = next;
    }

    ListNode temp = pre;
    if (temp != null && temp.val == t) {
        head = temp.next;
    } else {
        while (temp != null && temp.next != null) {
            if (temp.next.val == t) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }

    ListNode reversedHead = null;
    while (pre != null) {
        ListNode next = pre.next;
        pre.next = reversedHead;
        reversedHead = pre;
        pre = next;
    }

    return reversedHead;
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
        ListNode node9 = new ListNode(9);
        ListNode node10 = new ListNode(2);
        ListNode node11 = new ListNode(11);
        ListNode node12 = new ListNode(12);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;

        ListNode temp=head;
        
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        
        System.out.println();

        Solution solution = new Solution();
        
        int key=2;
        ListNode result = solution.removeDup(head,key);

        // Print the resulting list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
