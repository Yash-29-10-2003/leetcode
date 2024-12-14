# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        temp = ListNode(0)
        newList = temp  #newList acts as a pointer for the new list
        
        while list1 != None and list2 != None:    #runs until one of the lists end
            if list1.val <= list2.val:
                newList.next = list1
                list1 = list1.next
            else:
                newList.next = list2
                list2 = list2.next
            newList = newList.next  
        
        #if one list ends first adding all vals from others
        if list1 is not None:
            newList.next = list1
        elif list2 is not None:
            newList.next = list2
        
        return temp.next  #since temp at start would be none , we need to send the head as temp.next


