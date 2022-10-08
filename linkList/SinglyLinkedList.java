package linkList;

public class SinglyLinkedList {
    private Node head;
    // вставка в начало списка
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertLast(int data) {
        Node newNode = new Node(data);
        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    public void insertAfter(Node after, int data) {
        Node newNode = new Node(data);
        Node temp;
        temp = after.next;
        after.next = newNode;
        newNode.next = temp;
    }
    public void deleteLast() {
        Node current = head;
        Node temp = head;
        while (current.next != null) {
            temp = current;
            current = current.next;
        }
        current = temp;
        current.next = null;
    }
    public void deleteFirst() {
        head = head.next;
    }
    public void printLinkedList() {
        Node node = head;
        while(node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
    }
}
