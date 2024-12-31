package FindKthSmallest;

import java.util.Arrays;

public class FindKthSmallest {
    public static void main(String[] args) {
        int[] myarr = {3, 4, 1, 4, 6, 2};
        findKthSmallest(5, myarr);
    }

    // 3 4 1 4 6 2
    // 1 2 3 4 4 6
    public static void findKthSmallest(int k, int[] arr) {
        Arrays.sort(arr);

        System.out.println(arr[k-1]);

    }
}
