import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int count = 0,i;
    int ti[] = new int[n];
    int ci[] = new int[n];
    for(i=0;i<n;i++)
    {
      ti[i] = in.nextInt();
      ci[i] = in.nextInt();
    }
    for(i=0;i<n;i++)
    {
      if(ci[i]-ti[i]>=2)
      {
        count+=1;
      }
    }
