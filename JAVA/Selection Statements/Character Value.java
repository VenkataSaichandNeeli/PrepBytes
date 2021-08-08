import java.util.*;
import java.io.*;
  public class Main {
    public static void main(String args[]) throws IOException {
      //write your code here
      Scanner in = new Scanner(System.in);
      char c = in.nextLine().charAt(0);
      int r = (int)(c);
      switch(r){
        case 112:
          System.out.print("PrepBytes");
          break;
        case 80:
          System.out.print("PrepBytes");
          break;
        case 122:
          System.out.print("Zenith");
          break;
        case 90:
        System.out.print("Zenith");
          break;
        case 69:
          System.out.print("Expert Coder");
          break;
        case 101:
          System.out.print("Expert Coder");
          break;
        case 68:
          System.out.print("Data Structure");
          break;
        case 100:
          System.out.print("Data Structure");
          break;
      }
    }
  }
