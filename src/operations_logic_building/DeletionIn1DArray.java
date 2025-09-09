package operations_logic_building;

public class DeletionIn1DArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int pos = 2;

        for (int i = pos; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }


        arr[arr.length - 1] = 0;


        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}