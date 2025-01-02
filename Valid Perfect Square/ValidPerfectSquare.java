
// https://leetcode.com/problems/valid-perfect-square/?envType=problem-list-v2&envId=binary-search
public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147483647));
    }

    public static boolean isPerfectSquare(int num) {
        boolean result = false;
        
        long lIndex = 1;
        long rIndex = num;

        long midIndex = (lIndex+rIndex)/2;

        while (lIndex<=rIndex) {
            if (midIndex*midIndex == num) {
                result = true;
                break;
            }
    
            else if (midIndex*midIndex>num) {
                rIndex=midIndex-1;
                midIndex = (lIndex+rIndex)/2;
            }
    
            else if (midIndex*midIndex<num) {
                lIndex=midIndex+1;
                midIndex = (lIndex+rIndex)/2;
            }
        }


        return result;
    }
}
