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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode newHead = head.next;

        ListNode prev = null;
        ListNode first = head;
       while (first != null && first.next != null) {

            ListNode second = first.next;
            ListNode nextPair = second.next;

            second.next = first;
            first.next = nextPair;
            if (prev != null) {
                prev.next = second;
            }
            prev = first;
            first = nextPair;
        }

        return newHead;
    }
}


       