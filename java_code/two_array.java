import java.util.Scanner;

public class two_array {// enter 2d array element and display them and search position of  an element given by the user.

    public static void main(String[] args) {
       System.out.println("Enter a row ::");
       Scanner sc=new Scanner(System.in);
       int row=sc.nextInt();
       System.out.println("Enter  a coloum ::");
       int col=sc.nextInt();
       int [][]number=new int[row][col];
       for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               number[i][j]=sc.nextInt();
           }
           System.out.println();
       }
       System.out.println("you are Entered array is ::");
       for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               System.out.print(number[i][j]+" ");
           }
           System.out.println();
       }
       System.out.println("Enter a number which you want to find ");
       int n=sc.nextInt();
       for(int i=0;i<number.length;i++){
        for(int j=0;j<number.length;j++){
            if(number[i][j]==n){
                System.out.print("your searching number is "+ i+","+ j+" ");
            }
            
        }
        System.out.println();
    }

    }
}
