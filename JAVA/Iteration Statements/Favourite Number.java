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
        int rem,count = 0;
        while(n!=0)
        {
        rem = n % 10;
        if(rem == 5)
          count++;
        n = n / 10;
        }
        System.out.println(count);
      }
    }
  }
