import java.util.*;
  import java.io.*;
  
  public class Main {
    
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      while(t != 0)
      {
        int n = in.nextInt();
        int first = (int)(Math.log10(n));
        n = (int)(n / (int)(Math.pow(10,first)));
        System.out.println(n);
        t--;
        
      }
      
    }
  }
