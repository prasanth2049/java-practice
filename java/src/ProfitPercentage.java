import java.util.Scanner;

class ProfitPercentage
{
public static void main(String args[])
{

Scanner in = new Scanner(System.in);
System.out.println("Enter the number of dozens of toys purchased :");
int dozenCount = in.nextInt();
System.out.println("Enter the price per dozen  :");
int pricePerDozen = in.nextInt();
System.out.println("Enter the selling price of 1 toy :");
int sellPrice = in.nextInt();
Show s = new Show();
float profit = s.calculateProfit(dozenCount,pricePerDozen,sellPrice);

System.out.println("percentage::"+profit);
}
}
