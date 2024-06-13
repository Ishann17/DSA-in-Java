import java.util.Arrays;

/* Check if we can partition the array into two sub arrays with equal sum. More
formally, check that the prefix sum of a part of the array is equal to the suffix
sum of rest of the array. */
public class SubArrayWithEqualSum {

    static boolean breakArray(int [] a){
        int n = a.length;
        int totalSum = 0;
        for (int j : a) {
            totalSum += j;
        }
        
        int prefixSum = 0;
        for (int j : a) {
            prefixSum += j;
            int suffixSum = totalSum - prefixSum;
            if (prefixSum == suffixSum)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {

        int[]arr = {5,3,2,6,3,1};

        System.out.println(breakArray(arr));
    }
}
