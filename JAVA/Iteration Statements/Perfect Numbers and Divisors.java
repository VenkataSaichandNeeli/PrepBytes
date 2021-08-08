import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      while(t-->0)
      {
        int n = in.nextInt();
        int rem,sum=0;
        for(int i = 1;i < n;i++)
        {
        if(n % i == 0)
        sum = sum+i;
        }
  
      if(sum == n)
      System.out.println("true");
      else
      System.out.println("false");
      }
    }
  }
