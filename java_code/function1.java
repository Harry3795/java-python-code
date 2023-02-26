import java.util.*;
import java.util.jar.Attributes.Name;

public class function1
{
  public static void printMyName(String name) {
      System.out.println(name);
      return;
    
  }  
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter our Name ::");
        String name =sc.next();
    
        System.out.print("Your Name is ::");
        printMyName(name);
  }
}