import java.util.*; 

public class UrlSecure{

  public static void main(String[] args) {

          Scanner us = new Scanner(System.in);
          System.out.println("Enter the string ");
          String x = us.nextLine();
          System.out.println("Enter the start string ");
          String y = us.nextLine();
                                
          if(x.startsWith(y))
          {
          System.out.println(x+ " starts with \"https\" ");
          } 
          else {
          System.out.println(x+" does not start with \"https\"  ");
          }
  }
}
                                
