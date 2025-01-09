import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertionSort(new int[]{23,1,10,5,2})));
    }

    public static int[] insertionSort(int[] arr){
        int[] result = arr;
        
        if (arr.length==1) {return result;}


        int startIndex = 1;
        int lastIndex = arr.length-1;
        int currIndex = startIndex;
        
        while (startIndex!=lastIndex+1) {
            if (arr[currIndex] > arr[currIndex-1]) {
                startIndex +=1;
                currIndex = startIndex;
                continue;
            }

            else if (arr[currIndex] < arr[currIndex-1]){
                int temp = arr[currIndex-1];
                arr[currIndex-1] = arr[currIndex];
                arr[currIndex] = temp;

                if (currIndex!=1) {
                    currIndex -=1;
                }
            }

            
            
        }


        return result;
    }
}
