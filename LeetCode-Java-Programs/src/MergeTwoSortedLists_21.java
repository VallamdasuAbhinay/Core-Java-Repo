/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]
*/

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoSortedLists_21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(0);
        ListNode currentNode = dummyNode;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }
        currentNode.next = (list1 != null) ? (list1) : (list2);
        return dummyNode.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists_21 solution = new MergeTwoSortedLists_21();

        // Test case 1
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode mergedList1 = solution.mergeTwoLists(list1, list2);
        printList(mergedList1); // Output: 1 -> 1 -> 2 -> 3 -> 4 -> 4

        // Test case 2
        ListNode list3 = null;
        ListNode list4 = null;
        ListNode mergedList2 = solution.mergeTwoLists(list3, list4);
        printList(mergedList2); // Output: (empty)

        // Test case 3
        ListNode list5 = null;
        ListNode list6 = new ListNode(0);
        ListNode mergedList3 = solution.mergeTwoLists(list5, list6);
        printList(mergedList3); // Output: 0
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
