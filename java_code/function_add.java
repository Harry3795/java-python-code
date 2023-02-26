import java.util.Scanner;

public class function_add
{
public static int sum(int a , int b)
{
    int sum =a+b;
    return  sum;
    
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your number a ::");
    int a=sc.nextInt();
    System.out.println("Enter your number b ::");
    int b=sc.nextInt();
    
    sum(a, b);
    System.out.println("sum ::"+ sum(a,b));
}

}