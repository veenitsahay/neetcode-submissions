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
    public boolean hasCycle(ListNode head) {
        ListNode tail = head;
        Set<ListNode> set = new HashSet<>();

        while( tail != null){
            if(!set.add(tail)){
                return true;
            }
            tail = tail.next;
        }
        return false;
    }
}
