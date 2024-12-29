package Anagram;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        isAnagram("Listen", "Silent");
    }


    public static void isAnagram(String s1, String s2){
        s1 = s1.toLowerCase(); s2 = s2.toLowerCase();

        char[] c1 = s1.toCharArray(); char[] c2 = s2.toCharArray();
        
        Arrays.sort(c1); Arrays.sort(c2);
        
        if(Arrays.equals(c1, c2)){System.out.println("This is Anagram!");}
        else {System.out.println("This is not Anagram!");}
    }
}
