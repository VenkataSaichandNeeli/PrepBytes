import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      while(t-->0)
      {
        int max = -1;
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
          arr[i] = in.nextInt();
        }
        for(int i = n-1; i>=0; i--)
        {
          if(arr[i] == 1)
          {
            max = i;
            break;
          }
          else{
            max = -1;
          }
        }
          System.out.println(max);
        }
        
    }
  }
