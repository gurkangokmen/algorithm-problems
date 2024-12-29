package MiddleElementLinkedList;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;;

public class MiddleElementLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4));
        
        // odd 1 [2] 3
        // even 1 [2 3] 4
        if (list.size() % 2 == 1) {
            int index = (int) Math.floor(list.size() / 2.0);
            System.out.println(list.get(index));
        }

        if (list.size() % 2 == 0) {
            int index = list.size() / 2;
            int index2 = index - 1;

            System.out.println(list.get(index)); System.out.println(list.get(index2));
        }
    }
}
