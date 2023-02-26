// Q1). Write a program in Java for, In array 1-100 numbers are stored, one number is missing how do you find it.
import java.util.Scanner;

public class find_missing {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Enter array element size");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
            sum=sum+number[i];
        }
        int total=(size*(size+1))/2;
        int m=total-sum;
        System.out.println("missing number is :"+m);


    }
    
}
