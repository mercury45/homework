public class Node {
    Node next;
    int value;

    public Node() {
    }

    public Node(Node node) {
        this.next = node.next;
        this.value = node.value;
    }

    public Node(int value) {
        this.value = value;
    }


}
