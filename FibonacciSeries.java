public class FibonacciSeries {
    public static void fibo(int n){
        int a=0, b=1;
        for(int i=1; i<=n; i++){
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
    public static void main(String[] args) {
        int a = 5;
        fibo(a);
    }
}
