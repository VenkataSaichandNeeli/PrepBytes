import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner in = new Scanner(System.in);
      int m = in.nextInt();
      int n = in.nextInt();
      int[][] arr = new int[m][n];
      for(int i = 0; i < m; i++)
      {
        for(int j = 0; j < n; j++)
        {
          arr[i][j] = in.nextInt();
        }
      }
      int[][] temp = new int[m][n];
      for(int i = 0; i < m; i++)
      {
        for(int j = 0; j < n; j++)
        {
          temp[i][j] = arr[i][j];
        }
      }
      
      for(int i = 0; i < m; i++)
      {
        for(int j = i+1; j < n; j++)
        {
          arr[i][j] = 0;
        }
      }
      for(int i = 0; i < m; i++)
      {
        for(int j = 0; j < n; j++)
        {
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
      for(int i = 1; i < m; i++)
      {
        for(int j = 0; j < i; j++)
        {
          temp[i][j] = 0;
        }
      }
      for(int i = 0; i < m; i++)
      {
        for(int j = 0; j < n; j++)
        {
          System.out.print(temp[i][j]+" ");
        }
        System.out.println();
      }
    }
  }
