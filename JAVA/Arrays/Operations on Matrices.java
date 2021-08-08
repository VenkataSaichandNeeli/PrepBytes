import java.util.*;
  import java.io.*;
  public class Main {
    public static void main(String args[]) throws IOException {
      //write your code here
      Scanner sc = new Scanner(System.in);
      int add = 0 ;
      int m = sc.nextInt();
      int n = sc.nextInt();
      int arr[][] = new int[m][n];
      int array[][] = new int[m][n];
      int mul[][] = new int[m][n];
      int sum = 0;
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          arr[i][j] = sc.nextInt();
        }
      }
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          array[i][j] = sc.nextInt();
          add = arr[i][j] + array[i][j];
          System.out.print(add+" ");
        }
        System.out.println();
      }
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          for(int k=0;k<m;k++)
          {
            sum = sum + arr[i][k] * array[k][j];
          }
          mul[i][j] = sum;
          sum = 0;
          System.out.print(mul[i][j]+" ");
        }
        System.out.println();
      }
    }
  }
