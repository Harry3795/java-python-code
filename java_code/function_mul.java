import java.util.Scanner;

import javax.sound.sampled.FloatControl;

public class function_mul {
    public static float multiple(Float a , Float b)
    {
        Float multi=a*b;
        return multi;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your First Number :: ");
        float a=sc.nextFloat();
        System.out.println("Enter Your Second Number :: ");

        float b=sc.nextFloat();
        multiple(a,b);
        System.out.println("Your multiplication of number is ::"+multiple(a, b));


    }
}
