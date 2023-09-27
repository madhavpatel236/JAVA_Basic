// insertion at the end 

import java.util.LinkedList;

class Node {
    int data;
    Node next;

    Node(int newNode) {
        data = newNode;
        next = null;
    }
}

public class insertionAtTheEnd {
    Node head;

    public void insertAtEnd(int newData) {
        // intialize of the new node with the nodedata.
        Node newnode = new Node(newData);

        // linkedlist is empty
        if (head == null) {
            head = new Node(newData);
            return;
        }

        // linkedlist is not empty
        newnode.next = null; // entered nod eis last so their poinrt was null
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        return;
    }

    public void printNode() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(8);
        ll.insertAtEnd(10);
        ll.insertAtEnd(15);

        System.out.println("Linked List after successful insertion of all the nodes:");
        ll.printNode();
        System.out.println();
    }
}
