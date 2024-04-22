import java.util.Arrays;

//Given a sorted array Arr of size N and a value X, find the number of array elements less than or equal to X and elements more than or equal to X.
public class SmallerAndLargerInArray {
    static  int[] getMoreAndLess(int[] arr, int n, int x) {
        int [] ans = new int[2];
        int more = 0;
        int lessEqual = 0;
        for(int ele: arr){
            if(ele <= x){
                lessEqual++;
            }
            if(ele >= x){
                more++;
            }
        }
        ans[0] = lessEqual;
        ans[1] = more;
        return ans;
    }

    public static void main(String[] args) {
       int[] x = {3,3,3};
       int len = x.length;
       int value = 3;
       int[] ans = getMoreAndLess(x,len,value);
        System.out.println(Arrays.toString(ans));
    }
}
