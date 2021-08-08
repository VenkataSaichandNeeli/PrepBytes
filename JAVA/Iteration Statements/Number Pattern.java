import java.util.Scanner;
 
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 5; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
         
         
        sc.close();
    }
}
