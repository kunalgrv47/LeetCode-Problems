//***Logic is explained in problem description file***

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = null;
        ListNode swappedTail = null;
        while(head != null && head.next != null){
            ListNode nextHead = head.next.next;
            ListNode node1 = head;
            ListNode node2 = head.next;
            node1.next = node2.next;
            node2.next = node1;
            if(newHead == null){
                newHead = node2;
            }else{
                swappedTail.next = node2;
            }
            swappedTail = node1;
            head = nextHead;
        }
        return newHead;
    }
}