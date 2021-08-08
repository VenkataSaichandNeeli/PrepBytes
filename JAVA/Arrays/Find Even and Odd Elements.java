import java.util.*;
  import java.io.*;
  public class Main{
    // Print array method
    public static void main(String[] args)
    {
        // array with N size
        Scanner in =  new Scanner(System.in);
        
            int n = in.nextInt();
           int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            arr[i] = in.nextInt();
            int evensize=0;
            int oddsize = 0;
            for(int i = 0; i < n; i++)
            {
              if(arr[i] % 2 == 0)
              {
                evensize++;
              }
              else
              {
                oddsize++;
              }
            }
            int[] even = new int[evensize];
            int[] odd = new int[oddsize];
            int k = 0, j = 0;
            for(int i = 0; i < n; i++)
            {
              if(arr[i] % 2 == 0)
              {
              even[k] = arr[i];
               k++;
              }
              else
              {
              odd[j] = arr[i];
               j++;
              }
            }
            for(int i = 0; i < evensize; i++)
            {
              System.out.print(even[i]+" ");
            }
            System.out.println();
            for(int i = 0; i < oddsize; i++)
            {
              System.out.print(odd[i]+" ");
            }
            

    }
}
