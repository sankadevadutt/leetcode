# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        node = ListNode()
        head2 = node
        score = 0
        while(head and head.next):
            head = head.next
            while(head and head.val != 0):
                score += head.val
                head = head.next
            node.next = ListNode(score)
            node = node.next
            score = 0


        return head2.next