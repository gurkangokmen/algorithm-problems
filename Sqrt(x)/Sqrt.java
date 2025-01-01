import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }    


    public static int mySqrt(int x) {
        if (x==0) {
            return 0;
        }
        
        double result;

        //√2 = 1.4
        //√3 = 1.7
        //√4 = 2
        //√5 = 2.2
        //√9 = 3

        // Newton's Method (Babylonian)

        // find S/2
        double s = x / 2.0;
        List<Double> sList = new ArrayList<>(Arrays.asList(s));

        do {
            s = (s + (x/s))/2.0;
            sList.add(s);
            
        } while (Math.floor(sList.get(sList.size()-2)) != Math.floor(sList.get(sList.size()-1)));
        


        result = s;
       
        return (int) Math.floor(result);
    }
}
