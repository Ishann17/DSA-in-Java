import java.util.HashMap;
import java.util.Map;

public class ArraysEqualityCheck {
    public static void main(String[] args) {
        int[] a = {4,5,9,3,1};
        int[] b = {4,5,9,3,1};
        Map<Integer, Integer> freqA = new HashMap<>();
        Map<Integer, Integer> freqB = new HashMap<>();
        for(int i: a){
            freqA.put(i, freqA.getOrDefault(i, 0) + 1);
        }
        for(int i: b){
            freqB.put(i, freqB.getOrDefault(i, 0) + 1);
        }
        System.out.println(freqA.equals(freqB));
    }
}
