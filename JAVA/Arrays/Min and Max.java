import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        //write your code here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = in.nextInt();
            int min = arr[0];
            for (int i = 0; i < n; i++) {
                if (arr[i] < min)
                    min = arr[i];
            }
            System.out.print(min+" ");
            int max = arr[0];
            for (int i = 0; i < n; i++) {
                if (arr[i] > max)
                    max = arr[i];
            }
            System.out.println(max);
        }
    }
}
