import java.util.Arrays;

public class QuickSortTechnique {

    /*Partition method takes last element as pivot, places the pivot element at its correct position in sorted array,
    and places all smaller (smaller than pivot) to left of pivot and all greater elements to right of pivot.*/
    public static int partition(int[] a, int low, int high){
        int pivot = a[high];
        //The variable i is used to keep track of the “border” between elements less than the pivot and elements greater than the pivot.
        int i = low - 1;
        for(int j=low; j<high; j++){
            //check if current element is less than pivot, if yes then move it to left of pivot.
            if(a[j] <= pivot){
                i++;
                //swap the elements
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        //swap the pivot with the first element that is greater than the pivot, it will bring the pivot at the correct position.
        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;
        int pivotIndex = i+1;
        return pivotIndex;
    }
    /*Recursive Quick Sort Implementation*/

    public static void quickSort(int[] a, int low, int high){

        /*This line is a base case for the recursion. If low is not less than high,
        it means the array has one or zero elements and is therefore already sorted.*/
        if(low < high){

            int pi = partition(a, low, high);
            /*This line is a recursive call to the sort function for the part of the array that is to the left of the pivot.
              This will sort the left part of the array.*/
            quickSort(a, low, pi-1);

            /*This line is a recursive call to the sort function for the part of the array that is to the right of the pivot.
             This will sort the right part of the array.*/
            quickSort(a, pi+1, high);
        }
    }
    public static void main(String[] args) {
      int [] x = {10, 7, 8, 9, 1, 5, 11, 13, 0, 18, 2, 3, 4, 17, 16, 15, 14, 12, 6, 19, 20, 21, 22, 23, 24};
      int low  = 0;
      int high = x.length - 1;
      quickSort(x,low, high);
        System.out.println(Arrays.toString(x));
    }
}
