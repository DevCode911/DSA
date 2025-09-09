package node;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class NodeExample {
    public static void main(String[] args) {

        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);

        node.next = node1;
        node1.next = node2;

        System.out.println(node.data);
        System.out.println(node.next.data);
    }
}
