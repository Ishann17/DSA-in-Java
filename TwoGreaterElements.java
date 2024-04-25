import java.util.Arrays;

//Given an array of N distinct elements, the task is to find all elements in array except two greatest elements in sorted order.
public class TwoGreaterElements {
    public static long[] findElements( long a[], long n)
    {
        long[] ans = new long[a.length-2];
        int low = 0;
        int high = (int) n-1;
        quickSort(a, low, high);
        for(int i=0; i<ans.length; i++){
            ans[i] = a[i];
        }
        return ans;
    }
    public static int partition(long [] a, int low, int high){
        long pivot = a[high];
        int i = low - 1;
        for(int j=low; j<high; j++){
            if(a[j] <= pivot){
                i++;
                //swap
                int temp = (int) a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        //pivot index
        int temp = (int) a[i+1];
        a[i+1] = a[high];
        a[high] = temp;
        return i+1;
    }

    public static void quickSort(long[] a, int low, int high){
        if(low<high){
            int pi = partition(a, low, high);
            quickSort(a, low, pi-1);
            quickSort(a, pi+1, high);
        }
    }

    public static void main(String[] args) {
         long a[] = {2, 8, 7, 1, 5};
         long n = a.length;
         long[] k = findElements(a, n);
        System.out.println(Arrays.toString(k));
    }
}
