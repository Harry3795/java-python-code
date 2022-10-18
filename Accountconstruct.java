package test;
import java.util.Scanner;
public class Accountconstruct {
		
	public Accountconstruct(){
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter Your Name : ");
//		String n=sc.nextLine();
		String name="Pradeep";
		System.out.println("Account Holder name is :"+name);
	}
	public Accountconstruct(long accNumber,double balance) {
		System.out.println("Account Number is :"+ accNumber);
		System.out.println("Account Balance is :"+ balance);
	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Account number : ");
		long a1=sc.nextLong();
		System.out.println("Enter Your balance number : ");
		double b=sc.nextDouble();
		Accountconstruct a =new Accountconstruct();
		Accountconstruct ab =new Accountconstruct(a1,b);
	
	}

}
