package test;

import java.util.Scanner;

public class Checkagedrive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Age for Check Drive :");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age<18) {
			System.out.println(" He's  Not eligible to Driving");
		}
		else {
			System.out.println(" He's eligible to Driving");
		}
	}
}
