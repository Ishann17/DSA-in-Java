public class PalindromeNumber {
    public static boolean isPalindrome(int n){
        int num = n;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum = (sum * 10) + digit;
            n /= 10;
        }
        if(sum == num){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
       int a = 275414472;
        System.out.println(isPalindrome(a));
    }
}
