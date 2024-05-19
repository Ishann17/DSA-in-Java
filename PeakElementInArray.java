//An element is considered to be peak if it's value is greater than or equal to the values of its adjacent elements (if they exist).
public class PeakElementInArray {
    public static int peakElement(int[] arr,int n)
    {
        // Check for peak in the middle of the array.
        for(int i=1; i<n-1; i++){
            if(arr[i] >= arr[i-1] && arr[i]>= arr[i+1]){
                return i;
            }
        }

        //Check if First element is peak.
        if(n==1 || arr[0] >= arr[1]){
            return 0;
        }

        //Check if Last element is peak.
        if(arr[n-1] >= arr[n-2]){
            return n-1;
        }

        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1, 3, 7, 12, 6, 4, 1};
        int n = arr.length;
        System.out.println(peakElement(arr,n));
    }
}
