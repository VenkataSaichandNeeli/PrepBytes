import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    int temp,lastdigits=0;
    
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    
    while(x > 0)
    {
      temp = x % 10;
      lastdigits = lastdigits *10 + temp;
      x = x / 10;
      
    }
    System.out.println(lastdigits);
    
  }
}
