import java.util.Scanner;

public class pattern2 {
    
    public static void main(String[] args) {
        int i,j,k,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of pattern to print :: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i+1;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=n;i++)
        {
            for(j=0;j<=i-1;j++)
            {
            System.out.print(" ");
            }
            for(k=1;k<=n-i+1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
