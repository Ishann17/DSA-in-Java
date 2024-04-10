public class MissingNumInArray {
    static int missingNum(int [] arr, int n){
        //Using  a formula to get the total sum from 1 to n
        int sum = n*(n+1)/2;
        int ans = 0;
        for(int i=0; i<n-1; i++){
            ans += arr[i];
        }
        return sum - ans;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,5};
        int num = arr.length;
        int ok = missingNum(arr,num);
        System.out.println("Missing Number is: " + ok);
    }
}
