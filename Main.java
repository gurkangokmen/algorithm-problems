import java.util.List;
import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        int[] numbers = {10,10,10,10};

        int total_length = numbers.length;
        int sum = 0;

        for (int i : numbers) {
            sum = sum + i;
        }

        System.out.println("Average: " + (double) sum/total_length);
    }
}
