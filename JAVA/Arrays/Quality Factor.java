import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long difference;
      int array[] = new int[n];
      for(int i = 0; i < n; i ++){
        array[i] = sc.nextInt();
      }
      long first = array[0];
      long count = Math.abs(array[0]);
      for(int i = 1; i < n; i ++){
          difference = Math.abs(array[i] - first);
          count += difference;
          first = array[i];
          difference = 0;
        }
      System.out.println(count);
      
    }
  }
