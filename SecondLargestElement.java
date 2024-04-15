public class SecondLargestElement {
   static int print2largest(int arr[], int n) {
        // code here
        int largest = -1;
        int ans = 0;
        for(int i=0; i<n; i++){
            if(arr[i] > largest){
                ans = largest;
                largest = arr[i];
            }
            else if(arr[i] > ans && arr[i] < largest)
                ans = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
       int [] arr = {12, 35, 1, 10, 34, 1};
       int n = arr.length;
       int ok =  print2largest(arr,n);
        System.out.println(ok);
    }
}
