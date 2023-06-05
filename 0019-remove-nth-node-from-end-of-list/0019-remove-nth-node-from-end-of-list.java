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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode temp = head;
        
        if(head == null || (head.next == null && n == 1)) return null;
        
        while(temp != null){
            len++;
            temp = temp.next;
        }
        
        int fromFirst = len - n;
        temp = head;
        int counter = 1;
        
        if(fromFirst == 0) return head.next;
        
        while(temp!= null && counter++<fromFirst){
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
        
        return head;
        
    }
}