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
// class Solution {
//     public static ListNode rotate(ListNode head){
//         ListNode curr = head;
//         ListNode prev = null;
        
//         if(head == null || head.next == null){
//             return head;
//         }
//         while(curr.next != null){
//             prev = curr;
//             curr = curr.next;
//         }
//         curr.next = head;
//         prev.next = null;

//         return curr;
//     }
//     public ListNode rotateRight(ListNode head, int k) {

//         for(int i = 1; i <= k; i++){
//             head = rotate(head);
//         }

//         return head;
//     }
// }

class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode tail = head;
        int length = 1;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k = k % length;
        if (k == 0) {
            return head;
        }

        //list circular
        tail.next = head;

        int steps = length - k;

        ListNode newTail = head;
        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}