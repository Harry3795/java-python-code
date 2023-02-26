import java.util.Scanner;

public class print_prime {
    public static int isprime(int n) {
        for (int i = 2; i*i<=n; i++) {
            if(n%i==0){
                return 0;
            }
        }
        return 1;
        
    }
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.println("Enter second  number");
        int n2=sc.nextInt();
        for (int i = n1; i <=n2; i++) {
            if(isprime()){
                System.out.println(i);
            }
            
        }
        

        
       
        
    }
    
}
