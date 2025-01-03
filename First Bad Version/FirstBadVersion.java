
// https://leetcode.com/problems/first-bad-version/?envType=problem-list-v2&envId=binary-search
public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(2126753390));
    }

    public static int firstBadVersion(int n) {
        int result=0;

        long lIndex = 0;
        long rIndex = n-1;

        long midIndex = (lIndex+rIndex) / 2;

        while (lIndex<=rIndex) {
            System.out.printf("%d - %d - %d\n",lIndex,rIndex,midIndex);
            if (isBadVersion((int)midIndex+1)) {
                result = (int)midIndex+1;
                rIndex = midIndex - 1;
                midIndex = (lIndex+rIndex) / 2;
            }
    
            else {
                lIndex = midIndex+1;
                midIndex = (lIndex+rIndex) / 2;
            }
        }
        

        return result;
    }

    public static boolean isBadVersion(int version){
        if (version<1702766719) {
            return false;
        }

        else {return true;}
    }
}
