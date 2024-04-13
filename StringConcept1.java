//Try to Guess the Output for ta and sb in this question.
public class StringConcept1 {
    public static void main(String...args) {
     String ta = "A ";
     ta = ta.concat("B ");
     String tb = "C ";
     ta = ta.concat(tb);
     ta.replace("C", "X");
     ta = ta.concat(tb);
     System.out.println(ta + "\n");
        
    //another concept
        
     StringBuilder sb = new StringBuilder("B");
     sb.append(sb.append("A"));
     System.out.println(sb);
    }
}


//LINE 8 will replace the letters during runtime and create a new String Object, but we have not stored it anywhere.
/*
LINE 15 We are using to append function and evaluation will start from bracket. First, it will Append "B" and "A" and create "BA".
then it will again append on sb--->BA. that is BA.append(BA). Therefore the answer is BABA :)
*/
