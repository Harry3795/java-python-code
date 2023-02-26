import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        
        System.out.println("Enter a array index number");
        Scanner pk=new Scanner(System.in);
        int n=pk.nextInt();
        int []marks=new int[n];
        System.out.println("enter array element");
        
        for(int i=0;i<n;i++)
        {
            marks[i]=pk.nextInt();
        }
        
        System.out.println("the element of the array index is :");
        
         for(int j=0;j<n;j++)
        {
            System.out.print(marks[j]+" ");
        }
        
    }
    
}
