import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindow {
    static void printMax(int arr[], int N, int K) {
        Deque<Integer> Qi = new LinkedList<Integer>();
        int i;
        for (i = 0; i < K; ++i) {
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            // Add new element's index at rear of Queue
            Qi.addLast(i);
        }
        // Process rest of the elements
        // i.e. from arr[k] to arr[n-1]
        for (; i < N; ++i) {
            System.out.println(arr[Qi.peek()] + " ");
            while (!Qi.isEmpty() && Qi.peek() <= i - K) {
                Qi.removeFirst();
            }
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            // Add current element's index at the rear of Qi
            Qi.addLast(i);
        }
        // Print the maximum element of the last window
        System.out.println(arr[Qi.peek()]);
    }

    // Driver's code
    public static void main(String[] args) {
        int arr[] = {12, 1, 78, 90, 57, 89, 56};
        int k = 3;

        // Function call
        printMax(arr, arr.length, k);
    }
}
