import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      while(t-->0)
      {
        int n = in.nextInt();
        int[] arr =  new int[n];
        for(int i = 0; i < n; i++)
        {
          arr[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
          System.out.print(arr[i]+" ");
        }
        System.out.println();
      }
      
      
    }
  }
