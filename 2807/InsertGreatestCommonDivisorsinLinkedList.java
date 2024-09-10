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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
         ListNode prev = head, curr = prev.next;
        while(curr != null){
           ListNode newNode = new ListNode(gcdEuclid(prev.val, curr.val));
           prev.next = newNode;
           newNode.next = curr;
           prev = curr;
           curr = curr.next;
        }
        return head;
    }
     private int gcdEuclid(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}