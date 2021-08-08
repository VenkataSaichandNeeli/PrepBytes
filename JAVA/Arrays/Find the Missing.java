import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      while(t-->0)
      {
        int n =in.nextInt();
        long total = (long)n*(n+1)/2;
        int[] arr = new int[n-1];
        long sum = 0;
        for(int i = 0; i < n-1; i++)
        {
          arr[i] = in.nextInt();
          sum+=arr[i];
        }
        System.out.println(total-sum);
      }
      
    }
  }
