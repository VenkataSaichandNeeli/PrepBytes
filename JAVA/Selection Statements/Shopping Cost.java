import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i=0;i<n;i++)
      {
        int n1 = in.nextInt();
        int quantity = in.nextInt();
        if(n1 > 100)
        {
          float price = quantity * n1;
          float price1 = (price*20)/100;
          float price2 = price-price1;
          System.out.println(price2);
        }
        else
        {
          float price = quantity * n1;
          System.out.println(price);
        }
      }
      
    }
  }
