package BinarySearch;

import java.util.Arrays;

// input must be sorted
// or
// we have to sort array firstly

// https://www.geeksforgeeks.org/binary-search-in-java/


public class IterativeBinarySearch {
    public static void main(String[] args) {
        System.out.println(iterativeBinarySearch(new int[] {}, 3));
    }

    public static int iterativeBinarySearch(int[] arr, int target){
        int result;
        sort(arr);

        int rIndex = arr.length-1;
        int lIndex = 0;
        int midIndex = rIndex+lIndex / 2;
        
        while (true) {
            if (arr[midIndex] == target) {result = midIndex; break;}
            else if (target>arr[midIndex]){
                lIndex=midIndex+1;
                midIndex = rIndex+lIndex / 2;
                continue;
            }
            else if (target<arr[midIndex]){
                rIndex=midIndex-1;
                midIndex = rIndex+lIndex / 2;
                continue;
            }
        }

        return result;
    }

    public static int[] sort(int[] arr){
        Arrays.sort(arr);
        return arr;
    }
}
