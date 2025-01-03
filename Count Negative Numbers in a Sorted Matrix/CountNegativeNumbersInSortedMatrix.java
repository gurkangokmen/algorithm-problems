
// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/?envType=study-plan-v2&envId=binary-search
public class CountNegativeNumbersInSortedMatrix {
    public static void main(String[] args) {
        countNegatives(new int[][] {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}});
    }
    
    public static int countNegatives(int[][] grid) {
        int result = 0;

        for (int i = grid.length-1; i >= 0; i--) {
            int[] subGrid = grid[i];

            for (int j = subGrid.length-1; j >= 0 ; j--) {
                System.out.println(j);
                if (subGrid[j]<0) {result+=1;}
                else {break;}
            }
        }

        return result;
    }
}
