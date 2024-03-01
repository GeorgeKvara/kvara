class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class LinkedListReverse {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    // Method to print the reversed list
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print("<-");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListReverse solution = new LinkedListReverse();

        // Test Case 1: Empty list
        ListNode emptyList = null;
        System.out.println("Original list (empty):");
        solution.printList(emptyList);
        ListNode reversedEmptyList = solution.reverseList(emptyList);
        System.out.println("Reversed list (empty):");
        solution.printList(reversedEmptyList);
        System.out.println();

        // Test Case 2: Single element list
        ListNode singleElementList = new ListNode(10);
        System.out.println("Original list (single element):");
        solution.printList(singleElementList);
        ListNode reversedSingleElementList = solution.reverseList(singleElementList);
        System.out.println("Reversed list (single element):");
        solution.printList(reversedSingleElementList);
        System.out.println();

        // Test Case 3: List with multiple elements
        ListNode multipleElementList = new ListNode(1);
        multipleElementList.next = new ListNode(2);
        multipleElementList.next.next = new ListNode(3);
        multipleElementList.next.next.next = new ListNode(4);
        multipleElementList.next.next.next.next = new ListNode(5);
        System.out.println("Original list (multiple elements):");
        solution.printList(multipleElementList);
        ListNode reversedMultipleElementList = solution.reverseList(multipleElementList);
        System.out.println("Reversed list (multiple elements):");
        solution.printList(reversedMultipleElementList);
        System.out.println();
    }

}
