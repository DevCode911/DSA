package t2;

class Node {
    int data;
    Node left, right;
    Node(int d) { data = d; }
}

public class ValidateBST {
    public boolean isValidBST(Node root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(Node node, long min, long max) {
        if (node == null) return true;

        // check current node within range
        if (node.data <= min || node.data >= max) return false;

        // check subtrees with updated ranges
        return validate(node.left, min, node.data) &&
                validate(node.right, node.data, max);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);

        ValidateBST v = new ValidateBST();
        System.out.println(v.isValidBST(root)); // false
    }
}
