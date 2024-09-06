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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode current = head;

        while(current!=null){
            if(!set.contains(current.val)){
                curr.next=current;
                curr = curr.next;
            }
            current = current.next;
        }
        curr.next=null;
        return dummy.next;
    }
}