import java.util.*;
  import java.io.*;
  public class Main {
    static int numFriendRequests(int[] arr) {
        int[] count = new int[121];
        int[] ageSum = new int[121];
        for (int age : arr)
            count[age]++;
        int sum = 0;
        int ans = 0;
        for (int i = 15; i <= 120; i++) {
            sum += count[i];
            ageSum[i] = sum;
            if (count[i] > 0)
                ans += ((ageSum[i] - ageSum[i / 2 + 7] - 1) * count[i]);
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String args[]) throws IOException {
      //write your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
      {
        arr[i] = in.nextInt();
      }
      numFriendRequests(arr);
    }
  }
