package operations_logic_building;

import java.util.Scanner;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int key = 50;

        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element found at position: (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("Element not found in the matrix.");
        }

        sc.close();
    }
}
