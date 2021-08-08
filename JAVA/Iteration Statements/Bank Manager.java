import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      while(t-->0)
      {
        long count = 0;
        long n = in.nextLong();
        for(long i = 2; i<=n;i++)
        {
          while(n%i==0)
          {
            count = count+i;
            n = n/i;
          }
        }
        System.out.println(count);
      }
      
    }
  }
