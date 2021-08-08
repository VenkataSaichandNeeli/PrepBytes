import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
    Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int second = Math.max(Math.min(a,b), Math.min(Math.max(a,b),c));
      System.out.print(second);
    }
  }
