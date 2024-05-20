//Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not.
/*
Index Calculation:
a.charAt(i) - 'a' computes the array index for the character from string a.
b.charAt(i) - 'a' computes the array index for the character from string b.
This works because characters in Java can be treated as integers, and 'a' has an integer value that is used as a
reference point (its ASCII value is 97). Subtracting 'a' from any lowercase character will give an
index in the range 0-25, corresponding to that character's position in the alphabet.
 */
public class AnagramStrings {
    public static boolean isAnagram(String a,String b)
    {
        //If length of strings are not equal simply return false.
        if(a.length() != b.length()){
            return false;
        }
        //Using an array of size 26 (for each letter in the alphabet) to count the occurrences of each character.
        int []charCount = new int[26];

        for(int i=0; i<a.length(); i++){
            /*
            As we iterate through both strings simultaneously, we increment the count for characters in string a
            and decrement the count for characters in string b.
            */
            charCount[a.charAt(i) - 'a']++;
            charCount[b.charAt(i) - 'a']--;
        }

        //After processing both strings, if all values in the charCounts array are zero, then the strings are anagrams.
        for(int num : charCount){
            if(num != 0){
                return false;
            }
        }

       return true;
    }

    public static void main(String[] args) {

        String x = "plofblobhoga";
        String y = "blobhogaflop";
        System.out.println(isAnagram(x,y));
    }
}
