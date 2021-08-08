import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    int n[] = new int[t];
    for(int i = 0; i < n.length; i++)
    n[i] = in.nextInt();
    for(int i = 0; i < n.length; i++)
    {
      if(n[i] % 400 == 0)
      {
        System.out.println("Yes");
      }
      else if(n[i] % 100 == 0)
      {
        System.out.println("No");
      }
      else if(n[i] % 4 == 0)
      {
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
}
}
