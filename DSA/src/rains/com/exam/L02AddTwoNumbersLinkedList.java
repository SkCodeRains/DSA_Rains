package rains.com.exam;

class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    public SinglyLinkedListNode() {
    }

    public SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public SinglyLinkedListNode(int data, SinglyLinkedListNode next) {
        this.data = data;
        this.next = next;
    }
}

public class L02AddTwoNumbersLinkedList {

    public static void main(String[] args) {
        // Example usage:
        // Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        // Output: 7 -> 0 -> 8
        SinglyLinkedListNode l1 = new SinglyLinkedListNode(2, new SinglyLinkedListNode(4, new SinglyLinkedListNode(3)));
        SinglyLinkedListNode l2 = new SinglyLinkedListNode(5, new SinglyLinkedListNode(6, new SinglyLinkedListNode(4)));

        SinglyLinkedListNode sum = addTwoNumbers(l1, l2);

        // Print the result
        printLinkedList(sum); // Output: 7 -> 0 -> 8
    }

    public static SinglyLinkedListNode addTwoNumbers(SinglyLinkedListNode l1, SinglyLinkedListNode l2) {
        SinglyLinkedListNode dummyHead = new SinglyLinkedListNode();
        SinglyLinkedListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new SinglyLinkedListNode(sum % 10);
            current = current.next;
        }

        return dummyHead.next;
    }

    private static void printLinkedList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
