
// enter a array element  search an element and find the position of array elment 
import java.util.Scanner;

public class aman {
    public static void main(String[] args) {
        System.out.println("Enter array size");
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        int marks[]=new int[size];
        System.out.println("Enter array element: ");
        for(int i=0;i<size;i++){
            
            marks[i]=sc.nextInt();

        }
        System.out.println("Enter a number want to search");
         int  n=sc.nextInt();
        for(int i=0;i<size;i++){
            if (marks[i]==n){
                System.out.println("position of finding number is::"+(i+1));
            }


        }




        System.out.println("your enter aray is :");
        for(int i=0;i<size;i++){
            System.out.print(marks[i]+" ");
        }
        
        
    }
    
}
