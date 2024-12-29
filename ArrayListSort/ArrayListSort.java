package ArrayListSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,1,3));
        list.sort(null);

        Collections.sort(list);
        System.out.println(list);
    }
    
}
