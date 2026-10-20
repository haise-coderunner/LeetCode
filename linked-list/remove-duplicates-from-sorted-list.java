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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode left = head;
        ListNode right = head;
       
        while (left != null && left.next != null ){
            if (left.val == right.val){
                right = right.next;
                left.next = right;
            }
            else{
                right = right.next;
                left = left.next;
            }
        }
        return head;
    }
}