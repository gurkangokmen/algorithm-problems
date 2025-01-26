import java.util.List;
import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        int k = 9;
        for (int i = 1; i < k; i++) {
            
            int blank = k - i;
            
            for (int j = 0; j <= blank; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            for (int j = 0; j <= blank; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
