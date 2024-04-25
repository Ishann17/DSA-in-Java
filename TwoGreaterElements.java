import java.util.Arrays;

//Given an array of N distinct elements, the task is to find all elements in array except two greatest elements in sorted order.
public class TwoGreaterElements {
    public static long[] findElements( long a[], long n)
    {
        long[] ans = new long[a.length-2];
        int index = 0;
        long ele1 = -1;
        long ele2 = 0;
        //Finding two greater elements
        for (int i=0; i<a.length; i++){
            if(a[i] > ele1){
                ele2 = ele1;
                ele1 = a[i];
            } else if (a[i] > ele2 && a[i] < ele1) {
                ele2 = a[i];
            }
        }
        //Sorting value in the ans array
        for (int i = 0; i < a.length; i++) {
            if(a[i] != ele1 && a[i] != ele2){
                ans[index] = a[i];
                index++;
            }
        }
        //Sorted Using Bubble Sort Technique
        for(int i=0; i<ans.length-1; i++){
            for(int j=0; j< ans.length-i-1; j++){
                if(ans[j] > ans[j + 1]){
                    long temp = ans[j];
                    ans[j] = ans[j + 1];
                    ans[j + 1] = temp;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
         long a[] = {2, 8, 7, 1, 5};
         long n = a.length;
         long[] k = findElements(a, n);
        System.out.println(Arrays.toString(k));
    }
}
