public class ReverseString {
    static String revSTr(String s){
        String ans = "";
        for(int i=s.length()-1; i>=0; i--){
            ans += s.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        String x = "HELLO";
        System.out.println(revSTr(x));
    }
}
