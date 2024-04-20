import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String s = "abbbeedcc";
        char ch;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
    }
}
