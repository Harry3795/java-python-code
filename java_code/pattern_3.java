import java.util.Scanner;

public class pattern_3 {
    public static void main(String[] args) {
        int i,j;
        System.out.print("Enter N number to print pattern ::");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=n-1;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
