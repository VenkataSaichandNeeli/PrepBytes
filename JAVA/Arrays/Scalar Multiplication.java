import java.util.*;
import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner in = new Scanner(System.in);
      int m = in.nextInt();
      int n = in.nextInt();
      int k = in.nextInt();
      int[][] arr = new int[m][n];
      int[][] mul = new int[m][n];
      for(int i = 0; i < m; i++)
      {
        for(int j = 0; j < n; j++)
        {
          arr[i][j] = in.nextInt();
        }
      }
      for(int i = 0; i < m; i++)
      {
        for(int j = 0; j < n; j++)
          mul[i][j] = k * arr[i][j];
      }
      for(int i = 0; i < m; i++)
      {
        for(int j = 0; j < n; j++)
        {
           System.out.print(mul[i][j]+" ");
        }
          System.out.println();
      }
    }
  }
