import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      
      //write your code here
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      while(t > 0)
      {
        int n = in.nextInt();
        System.out.println(n+1);
        t--;
      }
      
    }
  }
