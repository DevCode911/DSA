import java.util.ArrayDeque;
import java.util.Deque;

class SlidingWindowMax{
    public static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>(); // store indexes
        int[] res = new int[nums.length - k + 1];
        int idx = 0;


        System.out.println(dq.offerLast(idx));

//        for (int i = 0; i < nums.length; i++) {
//
//            // 1. Remove indexes from front if outside the window
//            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
//                dq.pollFirst();
//                System.out.println(dq.peekFirst());
//
//            }
//
//
//
//            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
//                dq.pollLast();
//                System.out.println(dq.pollLast());
//            }
//
//            System.out.println(" DQ "+ dq.offerLast(i));
//
//
//        }
//
        return new int[3];

    }



}


public class MonotonicQueueEx {
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7,6};
        int k = 3;

        SlidingWindowMax.maxSlidingWindow(arr,k);
    }
}
