package week2;

import java.util.Arrays;

public class VowelString {
    public static int vowelStrings(String[] words, int left, int right) {
        return (int) Arrays.asList(words)
            .subList(left, right + 1)
            .stream()
            .filter(word -> isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1)))
            .count();
      }
    
      private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
      }

      public static void main(String[] args) {
        String [] words = {"aba","bcb","ece","aa","e"};
        System.out.println(vowelStrings(words,0,4));
      }
    
}
