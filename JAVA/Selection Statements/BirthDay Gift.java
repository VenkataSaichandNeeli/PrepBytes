import java.util.*;
  import java.io.*;
  
  public class Main {
    public static void main(String args[]) throws IOException {
      
      //write your code here
      Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
	while(T-->0) {
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		if(A==B) {
			System.out.println("YES");
		}else if(A>B && C>0) {
			System.out.println("NO");
		}else if(A<B && C<0) {
			System.out.println("NO");
		}
		else if(A==B && C==0){
	     System.out.println("YES");
		}
	     else if(C==0) {
	    	 System.out.println("NO");
	     }
			   
		else if(A>B && (A-B)%C==0) {
			System.out.println("YES");
		}else if(B>A && (B-A)%C==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
    }
    }
  }
