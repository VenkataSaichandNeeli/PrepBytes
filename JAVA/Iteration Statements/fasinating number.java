import java.util.*;
  import java.io.*;
  public class Main {
    public static void main(String args[]) throws IOException {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      for(int i=1 ;i<=N ;i++){
        int n = sc.nextInt();
        int a;
        int b;
        int c;
        int d;
        int k;
        for(int j=n+1 ; j<=10000; j++){
          k = j;
          a = k % 10;
          k = k/10;
          b = k % 10;
          k /=10;
          c = k % 10;
          k /=10;
          d = k % 10;
          if(a!=b && a!=c){
            if (a!=d && c!=d ){
              if (b!=c && b!=d){
                System.out.println(j);
                break;
              }
            }
          }
        }
      }
    }
  }
