//Problem : https://leetcode.com/problems/break-a-palindrome/description/
public class BreakAPalindrome {
    public static String breakPalindrome(String s){
        if(s.length() == 1){
            //It cannot be broken.
            return "";
        }
        char[] ch = s.toCharArray();
        int len = ch.length;
        // Iterate over the first half of the string
        for (int i = 0; i < len/2; i++) {
            // If the current character is not 'a'
            if(ch[i]!='a'){
                ch[i] = 'a';
                return new String(ch);
            }
        }
        // If all characters in the first half are 'a', change the last character to 'b'
        ch[len - 1] = 'b';
        return new String(ch);
    }

    public static void main(String[] args) {
        String s = "a";
        System.out.println(breakPalindrome(s));
    }
}
