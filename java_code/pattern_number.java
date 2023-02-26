import java.util.Scanner;

import javax.naming.ldap.ManageReferralControl;

public class pattern_number {
    public static void main(String[] args) {
        int i,j,k=1;
        System.out.print("Enter a number ::");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k++ +" ");
            

            }
            System.out.println();
        }
    }
    
}
