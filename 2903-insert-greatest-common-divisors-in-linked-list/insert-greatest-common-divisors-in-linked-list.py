# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def insertGreatestCommonDivisors(self, head: Optional[ListNode]) -> Optional[ListNode]:
        temp = head

        while(temp and temp.next):
            node = ListNode(self.GCD(temp.val, temp.next.val), temp.next)
            temp.next = node
            temp = node.next
        
        return head
    
    def GCD(self, v1: int, v2: int) -> int:
        while (v2):
            v1, v2 = v2, v1%v2
        return v1
        