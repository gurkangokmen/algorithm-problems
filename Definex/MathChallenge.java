package Definex;

import java.util.ArrayList;
import java.util.HashSet;

public class MathChallenge {
    public static int MathChallenge(int num1, int num2) {
        // code goes here
        HashSet<Integer> num1Remainders = new HashSet<>();
        ArrayList<Integer> num2Remainders = new ArrayList<>();

        for (int i = 1; i <= num1; i++) {
            if (num1%i==0) {
                num1Remainders.add(i);
            }
        }

        for (int i = 1; i <= num2; i++) {
            if (num2%i==0) {
                num2Remainders.add(i);
            }
        }

        int bigCommon = 0;
        for (int i = num2Remainders.size()-1; i >=0; i--) {
            if (num1Remainders.contains(num2Remainders.get(i))) {
                bigCommon = num2Remainders.get(i);
                break;
            }
        }

        return bigCommon;
      }
}
