/* Given an array of integers of size n. Answer q queries where you need to print the sum
    of values in a given range of indices from l to r (both included).
    Note: The values of l and r in queries follow 1-based indexing. */
public class PrefixSumProblem {

    static int preSum(int[]arr, int l, int r){
       //First find out the prefix sum of the whole array
        int n = arr.length;
        int[] pre  = new int[n];
        pre[0] = arr[0];
        for(int i=1; i<n; i++){
            pre[i] = pre[i-1] + arr[i];
        }
        //for the range of l to r with 1 based indexing
        if(l==1){
            return pre[r-1];
        }else{
            return pre[r-1] - pre[l-2];
        }
    }
    public static void main(String[] args) {
          int[] arr = {2,1,4,3,5};
        System.out.println(preSum(arr, 1,1));
    }
}
