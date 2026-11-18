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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode NodeA=list1;
        ListNode NodeB=list1;
       
        for(int i=0;i<a-1;i++){
            NodeA=NodeA.next;
        }

        for(int i=0;i<b+1;i++){
            NodeB=NodeB.next;
        }
        
        ListNode sec_list=list2;
        while(sec_list.next!=null)
        {
            sec_list=sec_list.next;
        }
       NodeA.next=list2;
       sec_list.next=NodeB;
        
        return list1;
    }
}