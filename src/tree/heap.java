package tree;

import java.util.*;
public class heap {
    public static void findKSmallest(int[] arr, int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();


        for(int i = 0; i < arr.length; i++){
            heap.add(arr[i]);

        }

        for(int i = 0; i < k; i++){
            heap.add(heap.poll());
        }
        System.out.println(heap);


    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 12, 2, 11};
        int k = 3;
        heap.findKSmallest(arr, k);
    }
}