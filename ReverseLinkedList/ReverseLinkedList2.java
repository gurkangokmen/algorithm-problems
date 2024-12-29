package ReverseLinkedList;

import java.util.LinkedList;
import java.util.Collections;

public class ReverseLinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("b");
        list.add("a");
        list.add("c");

        Collections.sort(list);

        System.out.println(list);
    }
}
