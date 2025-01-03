

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/?envType=study-plan-v2&envId=binary-search
public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        
    }
    
    public char nextGreatestLetter(char[] letters, char target) {
        char result = letters[0];
        
        int lIndex = 0;
        int rIndex = letters.length-1;
        int midIndex = (lIndex+rIndex)/2;

        while (lIndex<=rIndex) {
            if (String.valueOf(letters[midIndex]).compareTo(String.valueOf(target))<=0) {
                lIndex = midIndex+1;
                midIndex = (lIndex+rIndex)/2;
            }
    
            else if (String.valueOf(letters[midIndex]).compareTo(String.valueOf(target))>0) {
                result = letters[midIndex];
                rIndex = midIndex-1;
                midIndex = (lIndex+rIndex)/2;
            }   
        }


        return result;
    }
}
