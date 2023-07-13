class Solution{
    public Node rotate(Node head, int k) {
        if(head==null)return head;
        int ctr = 1;
        Node cur = head;
        while(ctr != k){
            ctr++;
            cur = cur.next;
        }
        if(cur.next == null){
            return head;
        }
        Node temp = cur;
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = head;
        head = temp.next;
        temp.next = null;
        
        return head;
    }
}
