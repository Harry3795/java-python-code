import java.util.Scanner;

public class pattern_trangle3
{
    public static void main(String[] args) {
        int i,j,k,n;
        System.out.print("Enter  N Number for pattern ::");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=2*n-2*i-1;k++)
            {
              System.out.print("*");
            }
            
            System.out.println();
        }
        for(i=1;i<=n-1;i++)
        {
            for(j=2;j<=n-i;j++)
            {
              System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++)
            {
              System.out.print("*");
            }
            
            System.out.println();
        }

    }
}