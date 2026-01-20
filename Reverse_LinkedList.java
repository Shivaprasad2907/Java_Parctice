// 7. Linked List Manipulation - Reverse Linked List
// Step 1: Understanding the problem
// The task is to reverse a singly linked list, so the head becomes the tail and vice versa.
// Step 2: Algorithm (Iterative Approach)
// 1. Initialize prev = None and current = head.
// 2. While current is not None:
// Store next_node = current.next.
// Set current.next = prev.
// Update prev = current.
// Update current = next_node.
// 3. Return prev (which will be the new head of the reversed list).

// Answer:
// For a linked list 1 -> 2 -> 3 -> 4 -> 5:
// 1. Initialize prev = None, current = 1.
// 2. Iteration 1: next_node = 2, current.next = None, prev = 1, current = 2.
// 3. Iteration 2: next_node = 3, current.next = 1, prev = 2, current = 3.
// 4. Iteration 3: next_node = 4, current.next = 2, prev = 3, current = 4.
// 5. Iteration 4: next_node = 5, current.next = 3, prev = 4, current = 5.      
// 6. Iteration 5: next_node = None, current.next = 4, prev = 5, current = None.
// The reversed linked list is 5 -> 4 -> 3 -> 2 -> 1.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Reverse_LinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to current
            current = nextNode; // Move to next node
        }
        return prev; // New head of the reversed list
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5); 
        System.out.println("Original Linked List:");
        printLinkedList(head);
        ListNode reversedHead = reverseList(head);
        System.out.println("\nReversed Linked List:");
        printLinkedList(reversedHead);
        System.out.println();
        System.out.println("Linked List after reversing again:");
        ListNode originalHead = reverseList(reversedHead);
        printLinkedList(originalHead);
    }
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
    
}