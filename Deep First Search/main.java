import java.util.Scanner;
import java.lang.Thread;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 2; i++) { // Loop for two attempts
            final boolean[] inputReceived = {false};

            // Thread to wait for user input
            Thread inputThread = new Thread(() -> {
                System.out.print("Attempt " + ": Enter something within 10 seconds: ");
                if (scanner.hasNextLine()) {
                    inputReceived[0] = true;
                    String input = scanner.nextLine();
                    System.out.println("You entered: " + input);
                }
            });

            inputThread.start();

            // Main thread waits for 10 seconds
            try {
                inputThread.join(10000); // Wait up to 10 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }

            // Check if input was received in time
            if (!inputReceived[0]) {
                System.out.println("\nTime's up! You didn't enter anything.");
                inputThread.interrupt(); // Interrupt input thread if still running
            }

            // Proceed to the next loop
            System.out.println("Proceeding to the next attempt...\n");
        }

        scanner.close();
    }
}
