import java.util.Scanner;

public class two_d_array {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.print("Enter row and coloms how many rows  ::");
        int row=sc.nextInt();
        System.out.print("Enter row and coloms how many  colums ::");
        int col=sc.nextInt();
        int [][] numbers =new int[row][col];
        System.out.println("Enter row and colums Element ::");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                numbers[i][j]=sc.nextInt(); 
            }
        }
        
        System.out.println(" your Enter Row and coloms are  ::");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            System.out.print(numbers[i][j] +" ");
            }
            System.out.println();
        }
        System.out.print("Enter a number which you want to search ::");
        int x= sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if (numbers[i][j]==x){

                
            System.out.println("The number found at index :: "+i+","+j);
                }
            }
        }

    }
}
