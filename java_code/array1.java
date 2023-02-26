import java.util.Scanner;
// Enter a array index by user and  find the array element 
public class array1 
{
    public static void main(String args[])
     {
        int i,flag=0;
        // System.out.println("hello java");
        Scanner pk = new Scanner(System.in);
        System.out.print("Enter Array Element Index Number which you want to Enter::");
        int size = pk.nextInt();

        //here size is the lenght that is size that give by user  
        int number[] = new int[size];// int[] number= new int[100];

        System.out.println("Enter Array "+ size +" Element");

        for(i=0;i<size;i++)
        {
            number[i]=pk.nextInt();
        }

        System.out.print("Your element is :: ");
        // Scanner pk1 = new Scanner(System.in);
        
        for(i=0; i<size;i++)
        {
            System.out.print(number[i]+" ");
        }
        System.out.print(" \nEnter your which you want to find ::");
        int n = pk.nextInt();
    
        
        for(i=0;i<number.length;i++)
        {               
            if(number[i] == n)
            {
            //  System.out.println("The Number "+n+"  which You Searching whose Index is :: "+ i );
            flag=1;
             break;
            
            }
            else 
            {
            //  System.out.println("The Number Is Not In This Array . ");
            flag=0;
           
            }
           
        }
        if(flag==1)
        {
        System.out.println("The Number "+n+"  which You Searching whose Index is :: "+ (i+1) );
        }
         else
        {
        System.out.println("The Number Is Not In This Array . ");
        }
    }
    
}
