/* Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3, and
when both these products are concatenated with the original number, then it results
in all digits from 1 to 9 present exactly once.*/
public class FascinatingNumber {
    public static boolean fascinating(long n) {
        // Multiply the input number by 2 and 3
        long value1 = n * 2;
        long value2 = n * 3;

        // Convert the original number and its multiples to strings
        String s1 = Long.toString(n);
        String s2 = Long.toString(value1);
        String s3 = Long.toString(value2);

        // Concatenate the strings to form the number to be checked
        String fasNum = s1 + s2 + s3;

        // Initialize an array to store the frequency of each digit (0 to 9)
        int[] freq = new int[10];

        // Iterate over each character in the concatenated string
        for(int i=0; i<fasNum.length();i++){
            // Convert the character at index i to an integer
            // '0' is subtracted from the char to get the integer value of the digit
            // Increment the count of this digit in the freq array
            freq[fasNum.charAt(i) - '0']++;
        }

        // Check if each digit from 1 to 9 appears exactly once in the concatenated string
        for(int i=1; i<=9; i++){
            // If any digit appears more than once or not at all, return false
            // This means the number is not fascinating
            if(freq[i] != 1){
                return false;
            }
        }

        // If the function has not returned false by now, it means the number is fascinating
        // So, return true
        return true;
    }
    public static void main(String[] args) {
       long n = 1853;
        System.out.println(fascinating(n));
    }
}
