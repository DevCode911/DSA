package operations_logic_building;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
//        int arr[] = {0,1,0,3,12};
        int arr[] = {1,0,2,0,3,0,4,0};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 0 && arr[j] > arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
