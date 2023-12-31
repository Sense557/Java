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
class Q_206 {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode nextPtr = null;

        while(current != null){
            nextPtr = current.next;
            current.next = prev;
            prev = current;
            current = nextPtr; 
        }
        head = prev;
        return head;
    }
}
