import java.util.Scanner;

public class func_fact {
    public static void factorial(int a)
    {
        int fact=1,i;
        for(i=a;i>=1;--i)
        {
            fact=fact*i;
           
        }
        System.out.println("Your factorial number is ::" + fact);
        return ;
    }
    public static void main(String[] args) {
        int a;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your that you want to factorial::");
        a=sc.nextInt();
        factorial(a);
        

        
    }
}
