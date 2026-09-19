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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode first=head;
        ListNode second=head.next;
        head=second;
        while (first != null && second != null) {
            ListNode third = second.next;

            second.next = first;
            first.next = third;

            if (third == null || third.next == null) {
                break;
            }

            first.next = third.next;
            first = third;
            second = first.next;
        }
        return head;
    }
}