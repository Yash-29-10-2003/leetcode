# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        
        dummy = ListNode(0, head)
        right = head                      # lenght of right = N
        left = dummy                      # lenght of left = N+1 due to dummy node

        while n>0: 
            right = right.next
            n -= 1                        #at the end of this the pointer should be at "n"th posi
        
        while right != None:              #this loops runs for N-n times , N = total length of LL
            right = right.next            
            left = left.next              #the left pointer goes upto "N-n"th position from start == (n - 1)th position from end
                                          # (N + 1) - (N - n) = - n + 1 , which is just before the nth position from the end
        
        left.next = left.next.next        #removing the next node , which is the nth node from the end
        return dummy.next