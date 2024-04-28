public class CapitalLetters {
    public static String transform(String s)
    {
       String[] words = s.split("\\s");
       StringBuilder sb = new StringBuilder();
       for(String word: words){
           String firstLetter = word.substring(0,1);
           String remainingLetters = word.substring(1);
           sb.append(firstLetter.toUpperCase()).append(remainingLetters).append(" ");
       }
       return sb.toString().trim();
    }
    public static void main(String[] args) {
      String x = "i love programming";
        System.out.println(transform(x));
    }
}
