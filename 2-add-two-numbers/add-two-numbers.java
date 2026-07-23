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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        
        int carry = 0;
        
        // 2. Loop until BOTH lists are exhausted AND there is no leftover carry
        while (l1 != null || l2 != null || carry != 0) {
            
            // Get the values from the current nodes. If one list is shorter 
            // and runs out of nodes, we just substitute a 0.
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            
            // 3. Add the two values plus any carry from the previous step
            int sum = val1 + val2 + carry;
            
            // Calculate the new carry (e.g., if sum is 14, carry becomes 1)
            carry = sum / 10;
            
            // Calculate the digit to store in the new node (e.g., if sum is 14, digit is 4)
            int digit = sum % 10;
            
            // 4. Create the new node and attach it to our result list
            current.next = new ListNode(digit);
            
            // Move our result pointer forward
            current = current.next;
            
            // Move l1 and l2 forward if they still have nodes left
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        // 5. Return the actual start of the result list (skipping the dummy zero)
        return dummyHead.next;
        
    }
}