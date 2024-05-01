/* Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3, and
when both these products are concatenated with the original number, then it results
in all digits from 1 to 9 present exactly once.*/
public class FascinatingNumber {
   public static boolean fascinating(long n) {
        long value1 = n * 2;
        long value2 = n * 3;

        String s1 = Long.toString(n);
        String s2 = Long.toString(value1);
        String s3 = Long.toString(value2);
        String fasNum = s1 + s2 + s3;

        // initializing an array to store the frequency of digits
        int[] freq = new int[10];
        // counting the frequency of each digit in the concatenated string
        for(int i=0; i<fasNum.length();i++){
            freq[fasNum.charAt(i) - '0']++;
        }
        //checking if each digit appears only once in the concatenated string
        for(int i=1; i<=9; i++){
            if(freq[i] != 1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       long n = 192;
        System.out.println(fascinating(n));
    }
}
