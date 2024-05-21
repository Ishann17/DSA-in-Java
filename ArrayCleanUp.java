import java.util.*;
/* Geek has been given an array arr[] of size n by his teacher. His task is to make the array empty using a specific
operation. In each operation, Geek can select a subsequence from the array such that all elements in that subsequence
are distinct. The goal is to empty the array using the minimum number of such operations.
*/
public class ArrayCleanUp {
    public static int minMoves(int n, int[] arr) {
        // Create a frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }

        // Create a priority queue and add all frequencies to it
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int freq : freqMap.values()) {
            pq.add(freq);
        }

        // The minimum number of operations to empty the array
        // would be equal to the frequency of the most frequent element
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = {2,9, 1, 1, 4, 3, 5, 5, 2};
        int n = arr.length;
        int result = minMoves(n, arr);
        System.out.println("Minimum number of moves: " + result);
    }
}
