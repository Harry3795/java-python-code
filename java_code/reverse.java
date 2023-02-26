import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.println("Enter a number which you want to reverse");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0,rem;
        
        while(n>0){
            rem=n%10;
            n=n/10;
            System.out.print(rem);

        }
        

    }
    
}
