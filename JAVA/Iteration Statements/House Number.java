import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0) {
        int n = sc.nextInt();
        int count = 0;
        int i = n;
        while(i>0) {
          i = i/10;
          count++;
        }
        if(count==1)
          System.out.println(n);
         else if(count==2)
          System.out.println(9 + (n-10+1)*2);
        else if(count==3)
          System.out.println(9 + 90*2+(n - 100 + 1)*3);
        else if(count==4)
          System.out.println(9 + 90*2 + 900*3 + (n - 1000 + 1)*4);
        else if(count==5)
          System.out.println(9 + 90*2 + 900*3 + 9000*4 + (n-10000 + 1)*5);
        else if(count==6)
          System.out.println(9 + 90*2 + 900*3 + 9000*4 + 90000*5 + (n-100000 + 1)*6);
        else if(count==7)
          System.out.println(9 + 90*2 + 900*3 + 9000*4 + 90000*5 + 900000*6 + (n-1000000 + 1)*7);
        else if(count==8)
          System.out.println((long)(9 + 90*2 + 900*3 + 9000*4 + 90000*5 + 900000*6 + 9000000*7+(long)(n - 10000000 + 1)*8));
        else if(count==9)
          System.out.println((long)(9 + 90*2 + 900*3 + 9000*4 + 90000*5 + 900000*6 + 9000000*7+(long) 90000000*8 +(long) (n - 100000000 + 1)*9));
        else if(count==10)
          System.out.println((long)(9 + 90*2 + 900*3 + 9000*4 + 90000*5 + 900000*6 + 9000000*7+(long) 90000000*8 +(long) 900000000*9 + (long)(n - 1000000000 + 1)*10));
      }
    }
    }
