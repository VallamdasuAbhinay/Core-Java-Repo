/**
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order, and each of their nodes contains a single digit. 
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 * Example #1:
 * 2 -> 4 -> 3
 * 5 -> 6 -> 4
 * -----------
 * 7 -> 0 -> 8
 * 
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807
 * 
 * Example 2:
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * 
 * Example 3:
	Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
	Output: [8,9,9,9,0,0,0,1]
 *
 */
public class AddTwoNumber_02 {
	
	// Definition for singly-linked list
	static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

	public static void main(String[] args) {
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		ListNode head1 = node1;
		
		ListNode node11 = new ListNode(5);
		ListNode node22 = new ListNode(6);
		ListNode node33 = new ListNode(4);
		node11.next = node22;
		node22.next = node33;
		ListNode head11 = node11;
		
		ListNode result = addTwoNumbers(head1, head11);
		printListNodeData(result);
	}

    private static void printListNodeData(ListNode result) {
    	ListNode temp = result;
    	while(temp!=null) {
    		System.out.print(temp.val + " -> ");
    		temp = temp.next;
    	}
    	System.out.println("null");
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
        ListNode dummyNode = new ListNode(0);
        ListNode currentNode = dummyNode;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0){
            int sum = carry;

            if(l1 != null){
                sum = sum + l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum = sum + l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;
        }
        return dummyNode.next;
    }
}