import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while(t-->0)
    {
      int n = in.nextInt();
      int count = 1;
      int rem= 0;
        rem = n%10;
        if(rem==0)
          System.out.println(count-1);
        else if(rem==5)
          System.out.println(count);
        else
          System.out.println(-1);
    }
  }
}
