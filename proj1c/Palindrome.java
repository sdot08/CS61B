

import java.util.LinkedList;


public class Palindrome {
    public static Deque<Character> wordToDeque(String word){
        Deque <Character> deque =new LinkedListDeque<>();
        for(int i=0;i<word.length();i++)
            deque.addLast(word.charAt(i));
        return deque;
    }

    public static boolean isPalindrome(String word, CharacterComparator cc){
        if(word.length()==1 || word.length()==0)
            return true;
        Deque <Character> deque=wordToDeque(word);
        int sizeP=deque.size();
        for(int i=0; i<sizeP/2;i++){
            if(!cc.equalChars(deque.removeFirst(),deque.removeLast()))
                return false;
        }
        return true;
    }




}

