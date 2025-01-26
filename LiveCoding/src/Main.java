import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        findLargestSum(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }

    public static void findLargestSum(int[] arr){
        int largestSum= arr[0];
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] + arr[i-1]>arr[i]){
                startIndex = i-1;
                endIndex = i;

                largestSum = largestSum + arr[i];
            }

            else if (arr[i] + arr[i-1]<arr[i]) {
                startIndex = i;
            }
        }

        System.out.println(startIndex + " " + endIndex);
    }
}