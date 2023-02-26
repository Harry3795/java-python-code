import java.util.Scanner;

public class pattern_traingle_number {
    public static void main(String[] args) {
        
        System.out.print("Enter n number ");
         Scanner sc = new Scanner(System.in);
         int n =sc.nextInt();
          for(int i=1;i<=n;i++){
              for(int j=1;j<=n-i;j++){
                  System.out.print(" ");
              }
              for(int k=i;k>=1;k--){
                  System.out.print(k);
              }
              for(int j=2;j<=i;j++){
                  System.out.print(j);
              }
              System.out.println();
          }
          for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    
}
/*
output
    1
   212
  32123
 4321234
543212345

 */