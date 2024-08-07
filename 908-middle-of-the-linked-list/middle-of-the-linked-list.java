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
    public ListNode middleNode(ListNode head) {
        ListNode tort = head, hare = head;
        while(hare!=null && hare.next!=null){
            tort = tort.next;
            hare = hare.next.next;
        }
        return tort;
    }
}