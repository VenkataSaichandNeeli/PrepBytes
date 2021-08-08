import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner in = new Scanner(System.in);
      int x = in.nextInt();
      int y = in.nextInt();
      if(x < y)
      System.out.printf("%d "+"is smaller than "+"%d",x,y);
      else if(x > y)
      System.out.printf("%d "+"is greater than "+"%d",x,y);
      else
      System.out.printf("%d "+"is equal to "+"%d",x,y);
      
    }
  }
