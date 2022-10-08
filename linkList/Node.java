package linkList;

public class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
    }
    Node() {
    }
    public void displayNodeData() {
        System.out.println(data + "->");
    }
}
