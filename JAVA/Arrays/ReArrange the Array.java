import java.util.*;
  import java.io.*;
  
  public class Main {
    
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner in = new Scanner(System.in);
      int t = in.nextInt();
      while(t-->0)
      {
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
          arr[i] = in.nextInt();
        }
        int[] temp = new int[n];
        int j = n-1;
        for(int i = 0; i < n; i+=2)
        {
          temp[i] = arr[j];
          j-=1;
        }
        int k = 0;
        for(int i = 1; i < n; i+=2)
        {
          temp[i] = arr[k];
          k += 1;
        }
        
        
        for(int i = 0; i < n; i++)
        {
          System.out.print(temp[i]+" ");
        }
        System.out.println();
        
      }
      
    }
  }
