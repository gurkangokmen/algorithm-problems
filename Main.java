import java.util.List;
import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] {1,3}, 0));
    }

    public static int searchInsert(int[] nums, int target) {
        int lIndex = 0;
        int rIndex = nums.length-1;
        int midIndex = (lIndex+rIndex)/2;
        int result;

 

        while(true){ 
            System.out.printf("%d - %d - %d\n",rIndex,lIndex,midIndex);
            if(nums[midIndex]==target){result=midIndex; break;}
            else if (rIndex==lIndex) {if(target>nums[rIndex]){result=rIndex+1;} else{ result=midIndex;} break;}
            else if (lIndex==midIndex && target<nums[midIndex]){result = midIndex; break;}
            else if(nums[midIndex]>target){
                rIndex = midIndex-1;
                midIndex = (lIndex+rIndex)/2;

                continue;
            }
            else if(nums[midIndex]<target){
                lIndex = midIndex+1;
                midIndex = (lIndex+rIndex)/2;
                continue;
            }
        }

        return result;
    }
}
