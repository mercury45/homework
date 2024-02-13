import java.util.List;

public class ListNode<Integer> {
    Node head;
    public ListNode() {
        head = null;
    }

    public void printList() {
        StringBuilder s = new StringBuilder("[" + head.value);
        Node current = head;
        while (current.next != null) {
            current = current.next;
            s.append(", " + current.value);
        }
        s.append("]");
        System.out.println("s = " + s);
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public int max() {
        int max = 0;
        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.value > max) {
                max = currentNode.value;
            }
            currentNode = currentNode.next;
        }
        return max;
    }

    public boolean find(int x) {
        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.value == x) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public void sort() {
        if (head == null || head.next == null) return;

        Node sorted = null;
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;


            // Вставка в начало
            if (sorted == null || currentNode.value <= sorted.value) {
                currentNode.next = sorted;
                sorted = currentNode;
            } else {
                // В центре
                Node temp = sorted;
                // Ищем куда вставить ноду
                while (temp.next != null && temp.next.value < currentNode.value) {
                    temp = temp.next;
                }
                currentNode.next = temp.next;
                temp.next = currentNode;

            }
            currentNode = next;
        }
        head = sorted;

    }


    public void deleteTwoFirst() {
        if (head != null && head.next != null && head.next.next != null) {
            head = head.next.next;
        }
    }

    public void deleteFirstFound(int x) {
        Node prev = head;
        Node currentNode = head.next;
        if (prev.value == x) {
            head = currentNode;
            return;
        }
        while (currentNode.value != x || currentNode.next != null) {
            prev = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode == null) return;
        else {
            prev.next = currentNode.next;
        }
    }

    public void deleteAllX(int x) {
        Node prev = head;
        Node currentNode = head.next;
        if (prev.value == x) {
            head = currentNode;
        }
        while (currentNode.next != null) {
            if (currentNode.value == x) {
                prev.next = currentNode.next;
            } else {
                prev = currentNode;
            }
            currentNode = currentNode.next;
        }
    }

    public void insertAfterFirstX(int x, int y) {
        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.value == x) {
                Node newNode = new Node(y);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                break;
            }

            currentNode = currentNode.next;
        }
    }

    public void insertBeforeFirstX(int x, int y) {
        Node prev = head;
        Node currentNode = head.next;
        if (prev.value == x) {
            Node newNode = new Node(y);
            Node Nodehead = new Node(prev);
            prev = Nodehead;
            newNode.next = Nodehead;
            head = newNode;
        }
        while (currentNode.next != null) {
            if (currentNode.value == x) {
                Node newNode = new Node(y);
                prev.next = newNode;
                newNode.next = currentNode;
                return;
            }
            prev = currentNode;
            currentNode = currentNode.next;
        }
    }

    public void insertAfterEachX(int x, int y) {
        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.value == x) {
                Node newNode = new Node(y);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
                currentNode = newNode.next;
            } else {
                currentNode = currentNode.next;
            }

        }
    }


}
