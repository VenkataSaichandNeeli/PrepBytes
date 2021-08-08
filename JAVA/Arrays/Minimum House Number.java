import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0) {
        int n = sc.nextInt();
        int min=100, count=0;
        int []arr = new int[n];
        for(int i=0; i<n; i++) {
          arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
          if(arr[i]<min)
          {
            min=arr[i];
            count=i;
          }
        }
        System.out.println(count);
      }                  
    }
  }
