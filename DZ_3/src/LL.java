public class LL {
    public Node head;

    public void revers() {
        if (head == null) {
            System.out.println("Пустой список не развернуть");
        } else {
            Node node = new Node();
            node.value = head.value;
            while (head.next != null) {
                Node temp = head.next;
                head.value = head.next.value;
                head.next = node;
                node = head;
                head = temp;
            }
            head = node;
        }
    }
    public void addFirst(int value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }
    public void print() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
    }
    private class Node {
        private int value;
        private Node next;
    }
}
