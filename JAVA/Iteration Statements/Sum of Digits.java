import java.util.*;
  import java.io.*;
  
  public class Main {
    
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner in = new Scanner(System.in);
      int sum =0, rem;
      int n = in.nextInt();
      while(n > 0)
      {
        rem = n % 10;
        sum = sum + rem;
        n = n / 10;
      }
      
      System.out.println(sum);
      
    }
  }
