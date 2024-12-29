package FindFactorial;

public class FindFactorial {
    // 3! = 3.2.1
    // 4! = 4.3.2.1 = 4.3!

    public static void main(String[] args) {
        System.out.println(findFactorial(4));
    }

    public static int findFactorial(int number){
        int result;
        
        if (number == 0 || number == 1) {result = 1;}
        else {result = number * findFactorial(number-1);}
        return result;
    }
}
