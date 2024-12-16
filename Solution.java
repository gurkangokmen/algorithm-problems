import java.util.Collection;
import java.util.Arrays;

class Solution {
    
    public boolean canConstruct(String ransomNote, String magazine) {
        int ransomNoteLength = ransomNote.length();
        int magazineLength = magazine.length();
        
        ransomNote = Arrays.sort(ransomNote.toCharArray());

        //aaabb
        //bb
        for (int i = 0 ; i < magazineLength - ransomNoteLength + 1; i++) {
            if(magazine.substring(i, i + ransomNoteLength).equals(ransomNote)){
                return true;
            };
        }

        return false;
    }
}