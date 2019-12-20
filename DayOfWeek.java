 import java.util.Scanner;
class DayOfWeek
{
                public static void main(String...arg)
                {
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the day number");
                int x= Integer.parseInt(sc.nextLine());
                
                String[]days={"","Sun","Mon","Tue","Wed","Thur","Fri","Sat"};
                
                int index= x%8;
                
                System.out.println("Day of the week is "+days[index]);
                }
}

