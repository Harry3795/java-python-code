import java.util.Scanner;

public class pattern_pyramid2 {
    public static void main(String[] args) {
        int i,j,k;
        System.out.print("Enter the number for print pattern ::");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(i=1;i<=n;i++)
       {
           for(j=1;j<=i-1;j++)
           {
               System.out.print(" ");
           }
               for(k=1;k<=n-i+1;k++)
               {
               System.out.print(" *");
               
               }
           
           System.out.println();
       } 
    //    this code is also running 
    //    for(i=1;i<=n;i++)
    //    {
    //        for(j=1;j<=n-i;j++)
    //        {
    //            System.out.print(" ");
    //        }
    //            for(k=1;k<=i;k++)
    //            {
    //            System.out.print(" *");
               
    //            }
           
    //        System.out.println();
    //    } 
    for(i=n;i>=1;i--)
    {
        for(j=1;j<=i-1;j++)
        {
            System.out.print(" ");
        }
            for(k=1;k<=n-i+1;k++)
            {
            System.out.print(" *");
            
            }
        
        System.out.println();
    } 
    }
    
}
