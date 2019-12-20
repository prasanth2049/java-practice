import java.util.Scanner;

public class Divide {
       public static void main(String arg[]) {
              try {

                     int a, b, c;
                     Scanner KB = new Scanner(System.in);

                     System.out.println("Enter the 2 numbers ");

                     a = KB.nextInt();
                     b = KB.nextInt();

                     c = a / b;
                     System.out.println("The quotient of " + a + "/" + b + "=" + c);
              } catch (ArithmeticException e) {
                     System.out.println("DivideByZeroException caught ");

              } finally {
                     System.out.println("Inside finally block");
              }
       }
}

