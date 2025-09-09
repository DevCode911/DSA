package operations_logic_building;

public class InsertionIin1DArray {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 1; arr[1] = 2; arr[2] = 3; arr[3] = 4; arr[4] = 5;
        int pos = 2, element = 99;

// Shift
        for (int i = 5; i > pos; i--) {
            arr[i] = arr[i - 1];

        }
        arr[pos] = element;

// Print
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
