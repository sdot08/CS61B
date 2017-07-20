
/** This class outputs all palindromes in the words file in the current directory. */
import java.lang.*;
import java.io.*;

public class PalindromeFinder {
    public static void main(String[] args) {
        int minLength = 4;
        In in = new In("words.txt");

        while (!in.isEmpty()) {
            String word = in.readString();
            if (word.length() >= minLength && Palindrome.isPalindrome(word,new offByN(1))) {
                System.out.println(word);
            }
        }
    }
}
