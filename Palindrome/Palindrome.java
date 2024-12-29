package Palindrome;

public class Palindrome{
    public static void main(String[] args){
        isPalindrome("radara");
        isPalindrome(13231);
    }

    public static void isPalindrome(String s){
        boolean isPalindrome = false;
        
        
        //radar
        String reservedS = "";
        
        for (int i = s.length()-1; i >= 0; i--) {
            reservedS = reservedS + s.charAt(i);
        }

        if (reservedS.equals(s)) {System.out.println("This is Palindrome!");}
        else {System.out.println("This is not Palindrome!");}
    }
    public static void isPalindrome(Integer i){
        isPalindrome(Integer.toString(i));
    }
}