import java.io.*;
import java.util.*;
public class Main{
  public static void main(String args[])
  {
Scanner sc = new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0) {
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) {
          arr[i] = sc.nextInt();
        }
        int count = 0;
        if(arr[0]>arr[1]) {
          System.out.print(0 + " ");
          count++;
        }
        for(int i=1; i<n-1; i++) {
          if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
            System.out.print(i + " ");
            count++;
          }
        }
        if(arr[n-1]>arr[n-2]) {
          System.out.print((n-1) + " ");
          count++;
        }
        if(count==0)
          System.out.print(-1);
        System.out.println();
      }
  }
}
