import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Intersection{
    public static void main(String[] args) {
        
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> resultArrayList = new ArrayList<>();

        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            hs1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            hs2.add(nums2[i]);
        }

        if (hs1.size()>hs2.size()) {hs2.forEach(x -> { if (hs1.contains(x)) { resultArrayList.add(x); } });}
        if (hs2.size()>=hs1.size()) {hs1.forEach(x -> { if (hs2.contains(x)) { resultArrayList.add(x); } });}
        
        int[] result = new int[resultArrayList.size()];
        for (int i = 0; i < resultArrayList.size(); i++) {
            result[i] = resultArrayList.get(i);
        }
        return result;
    }
}