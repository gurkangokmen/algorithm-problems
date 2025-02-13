import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any positive integer :: ");
        int num = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("The Prime Factors are :");
        printPrimeFactors(num);

        scanner.close();
    }

    private static void printPrimeFactors(int num){
        int limit = (int) Math.sqrt(num);

        for(int i=2;i<=limit;i++){
            while(num % i == 0){
                System.out.print(i+", ");
                num = num/i;
            }
        }
        if(num > 2)
            System.out.print(num);
    }
}