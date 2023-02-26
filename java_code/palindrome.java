import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a number to check palidrome ::");
             Scanner sc= new Scanner(System.in);
             int n=sc.nextInt();
             int temp=n;
             int rev=0,rem;
             while(temp!=0){
                 rem=temp%10;
                 rev=rev*10+rem;
                 temp=temp/10;
                 
                 
             }
             System.out.println(rev);
             if(n==rev){
                System.out.println("the palindrome");

             }
             else{
                 System.out.println("not palindrome");
             }
    }
    

    
}
