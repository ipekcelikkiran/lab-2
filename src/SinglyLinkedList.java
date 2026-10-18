/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 *
 * Your Name:        İpek Çelikkıran
 * Your Student ID:  250444020
 * Your Date:        12.10.2026
 */

public class SinglyLinkedList {

    // -------------------------------------------------------
    // Instance variable

    private Node head;

    // -------------------------------------------------------
    // Constructor

    public SinglyLinkedList() {
        head = null;
    }

    // -------------------------------------------------------
    // Add a node to the end of the list

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // -------------------------------------------------------
    // Display the linked list

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // -------------------------------------------------------
    // Find the middle node

    public Node findMiddle() {
        if (head == null) return null;
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        int middle = count / 2;
        current = head;
        for (int i = 0; i < middle; i++) {
            current = current.next;
        }
        return current;
    }

    // -------------------------------------------------------
    // Delete the middle node
    public void deleteMiddle() {

        if (head == null) {
            return;
        }
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        int middle = count / 2;
        if (middle == 0) {
            head = head.next;
            return;
        }
        Node previous = head;
        for (int i = 0; i < middle - 1; i++) {
            previous = previous.next;
        }
        previous.next = previous.next.next;
    }

    // -------------------------------------------------------
    // Get the head
    public Node getHead() {
        return head;
    }
}
