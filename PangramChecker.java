import java.util.List;

//A string is a pangram if it contains all letters of the English alphabet, ascii['a'-'z'].
// Given a list of strings, determine if each one is a pangram or not. Return "1" if true and "0" if false.
public class PangramChecker {
    public static String isPangram(List<String> str){
        StringBuilder result = new StringBuilder();
        boolean isPangram = true;
        for(String s: str){
            boolean[] check = new boolean[26];
            s = s.toLowerCase();
            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);
                if(Character.isLetter(ch)){
                    check[ch-'a'] = true;
                }
            }
            for(boolean letter : check){
                if(!letter){
                    isPangram = false;
                    break;
                }
            }
            result.append(isPangram ? '1' : '0');
        }

        return result.toString();
    }

    public static void main(String[] args) {
        List<String> pangramList = List.of("pack my box with five dozen liquor jugs", "this is not a pangram");
        String result = isPangram(pangramList);
        System.out.println("Result: " + result);
    }
}
