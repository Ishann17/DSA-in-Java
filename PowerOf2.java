//Check if N is a power of 2. More formally, check if N can be expressed as 2x for some integer x. Return true if N is power of 2 else return false.
public class PowerOf2 {
    public static boolean isPowerOfTwo(long n){
        if(n==0){
            return false;
        }
        while(n != 1){
            if(n%2 != 0){
                return false;
            }
            n = n/2;
        }
        return true;
    }
    public static void main(String[] args) {
          int a = 32;
        System.out.println(isPowerOfTwo(a));
    }
}
