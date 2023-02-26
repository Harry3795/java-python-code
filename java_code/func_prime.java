import java.util.Scanner;

import javax.swing.plaf.synth.SynthDesktopIconUI;

public class func_prime 
{
    
    public static void prime(int n,int k)
    {
       int i,j,flag=0;
        for(i=n;i<=k;i++)
        {
            for(j=2;j<=i-1;j++)
            {
                if(i%j==0)
                { 
                    flag=flag+1;
                }
            }
            if(flag==0){
                System.out.print(i+" ");
            }
            else{
                flag=0;
            }
       }
    }
     public static void main(String[] args) {
            
        // int x=1,i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first range ::");
        int n=sc.nextInt();
        System.out.println("Enter last range ::");
        int k=sc.nextInt();
        prime(n,k);
         
     
      
    }
    
}
