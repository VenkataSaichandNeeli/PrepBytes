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
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        arr[i] = in.nextInt();
    int max_val = 0;
    int sum = 0;
    for(int i=0;i<n;i++)
    {
      sum = 0;
      int j=i;
      while(j<n)
      {
        if(sum+arr[j]<0)
        {
          sum=0;
        }
        else
          sum += arr[j];
        max_val = Math.max(sum,max_val);
        j += k;
      }
    }
      System.out.println(max_val);
      }
      
      
    }
  }
