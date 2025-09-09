package Example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Node {
    int data;
    List<Node> g;

    Node(int data) {
        this.data = data;
        this.g = new ArrayList<>();
    }
}

public class PathExistsWithNode {
    public boolean validPath(int n, int[][] edges, int start, int end) {
        Node[] nodes = new Node[n + 1];
        for (int i = 1; i <= n; i++) {
            nodes[i] = new Node(i);
        }

        for (int[] edge : edges) {
            Node u = nodes[edge[0]];
            Node v = nodes[edge[1]];
            u.g.add(v);
            v.g.add(u);
        }

        Set<Integer> s = new HashSet<>();
        return dfs(nodes[start], end, s);
    }

    private boolean dfs(Node node, int end, Set<Integer> s) {
        if (node.data == end) return true;
        s.add(node.data);

        for (Node node1 : node.g) {
            if (!s.contains(node1.data)) {
                if (dfs(node1, end, s)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PathExistsWithNode obj = new PathExistsWithNode();

        int n = 5;
        int[][] edges = {
                {1, 2},
                {2, 3},
                {3, 4},
                {3, 5},
        };

        int start = 1;
        int end = 5;

        System.out.println(obj.validPath(n, edges, start, end));

    }
}
