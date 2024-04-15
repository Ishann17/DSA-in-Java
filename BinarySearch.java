public class BinarySearch {
    static int binarySearch(int arr[], int n, int k) {
        // code here
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid] < k){
                low = mid + 1;
            }
            else if(arr[mid] > k){
                high = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int [] a = {1, 2, 3, 4, 5, 6, 8, 9, 10, 14, 16, 19, 22, 23, 25, 26, 27, 29, 31, 34, 35, 36, 38, 39, 40, 45, 46, 48, 50, 51, 52, 57, 59, 60, 61, 63, 67, 68, 69, 71, 75, 76, 77, 79, 81, 82, 83, 86, 87, 88, 90, 92, 93, 94, 95, 96, 98, 99, 100};
       int n = a.length;
       int ele = 93;
       int ans = binarySearch(a, n, ele);
        System.out.println(ans);
    }
}