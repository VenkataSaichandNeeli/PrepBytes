import java.util.*;
  import java.io.*;
  
  public class Main {
     
    /* Driver program to test above function */
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      while(t-->0)
      {
        int m = in.nextInt();
        int n = in.nextInt();
        int res = (n * m) / 2;
        System.out.println(res);
      }
      
    }
  }
