import java.util.Scanner;

public class pattern_10101 {
    
    public static void main(String[] args) {
        System.out.print("Enter a number ::");
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1 ");

                }else{
                    System.out.print("0 ");
                }
                

            }
            System.out.println();

        }

    }
}
/* 
# output

1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*/