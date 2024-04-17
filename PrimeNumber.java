public class PrimeNumber {
    public static boolean isPrime(int n){
        if(n == 1 || n == 2){
            return true;
        }
        for(int i=3; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a = 25446;
        System.out.println(isPrime(a));
    }
}
