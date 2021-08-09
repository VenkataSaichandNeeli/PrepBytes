import java.util.*;
  import java.io.*;
  public class Main {
    public static void main(String args[]) throws IOException {
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0)
      {
        int n = sc.nextInt();
        int arr[] = new int[n];
        int k = sc.nextInt();
        int temp[] = new int[arr.length];
        k = k % n;
        for(int i=0;i<n;i++)
        {
          arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
          temp[(i + k) % arr.length] = arr[i];
        }
        for(int i=0;i<temp.length;i++)
        {
          System.out.print(temp[i]+" ");
        }
      }
    }
  }
