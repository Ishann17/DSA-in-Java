import java.util.Stack;

/* Given a string str, that consists of the characters 'A' and 'B' only, in one move, delete either an "AB" or a "BB"
substring and concatenate the remaining substrings.
Find the minimum possible length of the remaining string after performing any number of moves.
*/
public class SubStringRemoval {
    public static int getMinLength(String str){
        // Stack to keep track of characters in the string
        Stack<Character> stack = new Stack<>();

        // Iterate over each character in the input string
        for (char ch : str.toCharArray()) {
            // If the stack is not empty then we can form "AB" or "BB" with the top of the stack
            if (!stack.isEmpty()) {
                if (stack.peek() == 'A' && ch == 'B') {
                    // Remove "AB" by popping the 'A'
                    stack.pop();
                    continue;
                } else if (stack.peek() == 'B' && ch == 'B') {
                    // Remove "BB" by popping the 'B'
                    stack.pop();
                    continue;
                }
            }
            // Push the current character onto the stack if no substring was removed
            stack.push(ch);
        }

        //handle the case if stack is empty
        if(stack.isEmpty()){
            return 0;
        }

        // The size of the stack will be the minimum possible length of the remaining string
        return stack.size();
    }
    public static void main(String[] args) {
        System.out.println(getMinLength("BABBA")); // Expected output: 1
        System.out.println(getMinLength("ABAB")); // Expected output: 0
        System.out.println(getMinLength("BBAA")); // Expected output: 2
    }
}
