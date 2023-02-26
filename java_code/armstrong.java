import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        // System.out.println("Enter a Number for check armstrong ::");
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int n;
        // int temp=n;
        int rem,sum=0;
        System.out.println("Enter minimun Number ");
        int min=sc.nextInt();
        System.out.println("Enter maximum Number ");
        int max=sc.nextInt();
        int power=String.valueOf(max).length();

    for(int i=min;i<=max;i++){
        n=i;
        
        while(n>0){
            rem=n%10;
            sum+=Math.pow(rem, power-1);
            // sum+=rem*rem*rem;
            n=n/10;
            
        }
        // for(int i=min;i<=max;i++){
            //     rem=n%10;
            //     sum+=Math.pow(rem, power);
            //     n=n/10;
            // }
            // System.out.println(sum);
            if(sum==i){
                System.out.println(i+" ");
            }
            sum=0;
        }

    }
    
}
