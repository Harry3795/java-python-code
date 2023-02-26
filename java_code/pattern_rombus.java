import java.util.Scanner;

public class pattern_rombus{
    public static void main(String[] args) {
        System.out.print("Enter n number ");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=n;k++){
            System.out.print("* ");
            }
            System.out.println();
        }
        /*
        """reverse of rombus"""
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=n;k++){
            System.out.print("* ");
            }
            System.out.println();
        }*/
    }
}/*
 output
   *****
  *****
 *****
*****
*/