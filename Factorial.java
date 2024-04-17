public class Factorial {
    public static int fact(int n){
        //base case to prevent Stack Overflow.
        if(n == 0 || n == 1)
            return 1;
        //recursion approach
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println(fact(a));
    }
}
