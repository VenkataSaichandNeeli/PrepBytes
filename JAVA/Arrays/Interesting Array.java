import java.util.*;
  import java.io.*;
  public class Main {
    public static void main(String args[]) throws IOException {
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int l = 0;
        int r = n - 1;
        int flag = 0;
        while(l<r){
          int sum = arr[l] + arr[r] ;
          if(sum == k){
            flag = 1;
            System.out.print(l+" "+r);
            break;
          }
          if(sum > k){
            r--;
          }
          if(sum< k){
            l++;
          }
        }
        if(flag == 0){
            System.out.print("no answer");
          }
          System.out.println();
      }
    }
  }
