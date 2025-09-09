package grapth;

import java.util.Scanner;

public class WeightedGraphEx {

    public static void takeInputUsingAdjacency(int n, int m, Scanner scanner) {
        int[][] adj = new int[n + 1][m + 1];
        for (int i = 0; i < m; i++) {
            System.out.print("Enter u:- ");
            int u = scanner.nextInt();
            System.out.print("Enter v:- ");
            int v = scanner.nextInt();
            System.out.print("Enter Weight:- ");
            int weight = scanner.nextInt();

            adj[u][v] = weight;
            adj[v][u] = weight;

        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(adj[i][j] + " ");
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

                takeInputUsingAdjacency(
                n,
                m,
                scanner
        );

    }
}
