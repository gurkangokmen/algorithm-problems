import java.util.List;
import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        //System.out.println(iterativeBinarySearch(new int[] {1,2,3,4,5,6}, 3));

        if (14 / 4.0 == 14 / 4) {
            System.out.println("True");
        }
    }

    public static int iterativeBinarySearch(int[] arr, int target){
        int result;
        
        int lIndex = 0;
        int rIndex = arr.length-1;

        int midIndex = (rIndex+lIndex) / 2;

        while (true) {
            if (target==arr[midIndex]) {
                result = midIndex;
                break;
            }
    
            else if (arr[midIndex]<target) {
                lIndex = midIndex+1;
                midIndex = (rIndex+lIndex) / 2;
            }
    
            else if (target<arr[midIndex]) {
                rIndex = midIndex-1;
                midIndex = (rIndex+lIndex) / 2;
            }
        }
 
        return result;
    }
}
