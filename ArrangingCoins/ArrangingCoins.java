package ArrangingCoins;

// https://leetcode.com/problems/arranging-coins/description/?envType=problem-list-v2&envId=binary-search
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        int result = 1;
        long curr = 0;
        
        // 1
        // 2
        // 3
        for (int i = 1; curr < n; i++) {
            curr += i;
            result = i;
        }

        if (curr>n){result-=1;}

        return result;


    }
}
