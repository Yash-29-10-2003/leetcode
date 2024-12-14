# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        while head != None and head.val == val:
            head = head.next
        current = head
        previous = None
        while current != None:
            if current.val == val:
                previous.next = current.next
                current = previous.next
            else:
                previous = current
                current = current.next
        return head
        