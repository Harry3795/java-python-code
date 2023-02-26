import java.util.Scanner;

public class pattern_pyramid {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number to print your pattern ::");
        int n = sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=n-1;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=2*n-1-2*i;k++)
            // for(k=1;k<=-4*n*i-3;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
 