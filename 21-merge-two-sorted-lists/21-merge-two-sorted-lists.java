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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            ListNode ans = null;
            return ans;
        }
        ListNode ans = new ListNode(), temp = ans;
        int i=0, j=0;
        while(list1 != null && list2 != null){
            // temp = new ListNode();
            if(list1.val < list2.val){
                temp.val = list1.val;
                list1 = list1.next;
            }else{
                temp.val = list2.val;
                list2 = list2.next;
            }temp.next = new ListNode();
            temp = temp.next;
        }
        while(list1 != null){
            temp.val = list1.val;
            list1 = list1.next;
            if(list1 != null){
                temp.next = new ListNode();
                temp= temp.next;
            }
        }while(list2 != null){
            temp.val = list2.val;
            list2 = list2.next;
            if(list2 != null){
                temp.next = new ListNode();
                temp= temp.next;
            }
        }
        return ans;
    }
}