import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        int []num=new int[size];
        System.out.println("Enter Array Element");
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }

        System.out.println("your enter array is ::");
        for(int i =0;i<num.length;i++){
            System.out.println(num[i]);
        }
        System.out.println("Enter Number for searching ::");
        int n=sc.nextInt();

        for(int i=0;i<=num.length;i++){
            if(i==n){
                System.out.println("this number is present in array "+ i +"th Index");
            }
            
        }
        
        }
        
    }


