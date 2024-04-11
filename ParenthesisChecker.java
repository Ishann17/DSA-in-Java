import java.util.Stack;

public class ParenthesisChecker {
    static boolean ispar(String x) {
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<x.length(); i++){
            char ch = x.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stk.push(ch);
            }
            else{
                if(stk.isEmpty())
                    return false;
                char top = stk.pop();
                if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '['))
                    return false;
            }
        }
        return stk.isEmpty();
    }
    public static void main(String[] args) {
        String s = "[({[([{}])]})}";
        boolean flag = ispar(s);
        System.out.println(flag);
    }
}
