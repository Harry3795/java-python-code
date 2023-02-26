import java.util.Scanner;

public class pattern_v {
    public static void main(String[] args) {
        int i,j,n;
        System.out.print("Enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(int l=1;l<=i;l++){
               System.out.print("*");
                }
              for(j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
            System.out.println();
        }
        /* both of the code is running we can use both of the code
        for(i=1;i<=n;i++){
            for(int l=1;l<=n-i+1;l++){
               System.out.print("*");
                }
              for(j=1;j<=2*i-2;j++){
                System.out.print(" ");
                }
                for(int k=1;k<=n-i+1;k++){
                    System.out.print("*");
                }
            System.out.println();
        }
 */
        for(i=n;i>=1;i--){
            for(int l=1;l<=i;l++){
               System.out.print("*");
                }
              for(j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                }
            System.out.println();
        }
    }
    
}
/*
output
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
        */
