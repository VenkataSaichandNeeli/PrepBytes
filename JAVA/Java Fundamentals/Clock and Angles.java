import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    while(t!=0)
    {
      int h = in.nextInt();
      int m = in.nextInt();
      int hour = (h*360)/12+(m*360)/(12*60);
      int min = (m*360)/60;
      int angle = Math.abs(hour - min);
      if(angle > 180)
      angle=360-angle;
      System.out.println(angle);
      t--;
      
    }
  }
}
