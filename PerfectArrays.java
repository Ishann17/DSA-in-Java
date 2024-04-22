//An array is said to be perfect if its reverse array matches the original array.
public class PerfectArrays {
    public static boolean isPerfect(int n, int[] arr) {
        int [] rev = new int[n];
        int index = 0;
        for(int i=arr.length-1; i>=0; i--){
            rev[index] = arr[i];
            index++;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] != rev[i]){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
       int [] arr = {1, 2, 3, 4, 5};
       int len = arr.length;
        System.out.println(isPerfect(len, arr));
    }
}
