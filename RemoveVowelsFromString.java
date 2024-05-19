public class RemoveVowelsFromString {
    static String removeVowels(String S) {
        S.toLowerCase();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<S.length();i++){
            char ch = S.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sb.append("");
            }
            else{
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String x = "welcome to geeksforgeeks";
        System.out.println(removeVowels(x));
    }
}
