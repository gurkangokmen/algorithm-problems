package ReverseLinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        
        System.out.println(list);

        

        Collections.reverse(list);

        System.out.println(list);

        
    }
}
