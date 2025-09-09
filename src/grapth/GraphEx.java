package grapth;

import java.util.ArrayList;
import java.util.Scanner;

public class GraphEx {

    public static void takeInputUsingAdjacency(int n, int m, Scanner scanner) {
        int[][] adj = new int[n + 1][m + 1];
        for (int i = 0; i < m; i++) {
            System.out.print("Enter u:- ");
            int u = scanner.nextInt();
            System.out.print("Enter v:- ");
            int v = scanner.nextInt();

            adj[u][v] = 1;
            adj[v][u] = 1;

        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void tackInputUsingList(int n, int m, Scanner scanner) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < m; i++) {
            adj.add(new ArrayList<>());

            // edge 1----2
            adj.get(1).add(2);
            adj.get(2).add(1);

            // edge 2----3
            adj.get(2).add(3);
            adj.get(3).add(2);

            // edge 1----3
            adj.get(1).add(3);
            adj.get(3).add(1);

            System.out.print("Enter u:- ");
            int u = scanner.nextInt();
            System.out.print("Enter v:- ");
            int v = scanner.nextInt();

//            adj.get(u)
//               .add(v);
//            adj.get(v)
//               .add(u);

        }

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < adj.get(i)
                                   .size(); j++) {
                System.out.print(adj.get(i)
                                    .get(j) + " ");
            }

            System.out.println();
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number of Node:- ");
        int n = scanner.nextInt();
        System.out.print("Enter Number of Edges:- ");
        int m = scanner.nextInt();

//        takeInputUsingAdjacency(
//                n,
//                m,
//                scanner
//        );

        tackInputUsingList(
                n,
                m,
                scanner
        );
    }
}
