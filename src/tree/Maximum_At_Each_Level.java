package tree;

/*
        1
       / \
      2   3
     / \   \
    4   5   6
   / \
  7   9

 */

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left,right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

class FindMaxNoAtEachLevel{

    void bsfMaxNo(Node root){

        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            int temp = 0;
            for (int i = 0; i < size; i++) {
                Node n = queue.poll();

                if (temp < n.data){
                    temp = n.data;
                }

                if (n.left != null) queue.add(n.left);
                if (n.right != null) queue.add(n.right);
            }
            System.out.print(temp+" ");
//            System.out.print(size+" ");

        }

    }


    public void printMaxChild(Node root) {
        if (root == null) return;

        int max = 0;
        if (root.left != null && root.right != null) {
//            int max = Math.max(root.left.data, root.right.data);
            if (root.left.data > root.right.data){
                 max = root.left.data;
            }else {
                max = root.right.data;
            }

            System.out.println("Node " + root.data + " -> Max child = " + max);
        }

        // recursively go left and right
        printMaxChild(root.left);
        printMaxChild(root.right);
    }


}


public class Maximum_At_Each_Level {
    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(12);
//        root.left.right = new Node(5);
//        root.right.left = new Node(4);
//        root.right.right = new Node(6);
//        root.left.left.left = new Node(7);
//        root.left.left.right = new Node(8);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(7);
        root.right.right = new Node(6);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);

        FindMaxNoAtEachLevel eachLevel = new FindMaxNoAtEachLevel();
        eachLevel.bsfMaxNo(root);
        System.out.println();
        eachLevel.printMaxChild(root);


    }
}



