import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner in = new Scanner(System.in);
      if(in.hasNext())
      {
      int t = in.nextInt();
      for(int i = 0;i < t;i++)
      {
        int n = in.nextInt();
        if(n % 8 == 0)
        System.out.println((n-1)+"SL");
        else if(n % 8 == 1)
        System.out.println((n+3)+"LB");
        else if(n % 8 == 2)
        System.out.println((n+3)+"MB");
        else if(n % 8 == 3)
        System.out.println((n+3)+"UB");
        else if(n % 8 == 4)
        System.out.println((n-3)+"LB");
        else if(n % 8 == 5)
        System.out.println((n-3)+"MB");
        else if(n % 8 == 6)
        System.out.println((n-3)+"UB");
        else if(n % 8 == 7)
        System.out.println((n+1)+"SU");
      }
      }
      
    }
  }
