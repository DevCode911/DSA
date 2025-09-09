package node;

import java.util.LinkedList;
import java.util.Queue;

class Node1{
    String name;
    Node1 next;

    Node1(String name){
        this.name = name;
        this.next = null;
    }
}

class LL {
    Node head;

    public void insertAtStart(int data){
        System.out.println(head);
    }
}

public class NodeEx {

    public static void main(String[] args) {

        Node1 node1 = new Node1("Dev");
        Node1 node2 = new Node1("Jay");
        Node1 node3 = new Node1("Kiran");

        System.out.println(node1);

//        node1.next = node2;
//        System.out.println(node1.next);
//        node2.next = node3;

//        Node current = node1;
//        while (current != null){
//            System.out.println(current.name);
//            current = current.next;
//        }

//        LL ll = new LL();
//        ll.insertAtStart(10);

        Queue<Node> queue = new LinkedList<>();

    }
}
