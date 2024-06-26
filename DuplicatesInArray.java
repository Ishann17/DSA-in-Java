import java.util.ArrayList;

public class DuplicatesInArray {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ans  = new ArrayList<>();
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[arr[i]] += 1;
        }
        for(int i=0; i<n; i++){
            if(a[i]>1){
                ans.add(i);
            }
        }
        if(ans.isEmpty()){
            ans.add(-1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] abc = {3, 4, 5, 6, 1, 2, 0};
        int n = abc.length;
        System.out.println(duplicates(abc, n));
    }
}
