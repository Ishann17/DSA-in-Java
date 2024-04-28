//Given a number, reverse it and add it to itself unless it becomes a palindrome or number of iterations becomes more than 5.
public class SumPalindrome {
    static int isSumPalindrome(int n){
        int count = 0;
        while(count<=5){
            int originalNum = n;
            int reversedNum = 0;
            //logic to reverse the number
            while(n != 0){
                int digit = n%10;
                reversedNum = (reversedNum * 10) + digit;
                n /= 10;
            }
            if(reversedNum ==  originalNum){
                return reversedNum;
            }
            n = originalNum + reversedNum;
            count++;
        }
        return -1;
    }
    public static void main(String[] args) {
         int n = 861;
        System.out.println(isSumPalindrome(n));
    }
}
