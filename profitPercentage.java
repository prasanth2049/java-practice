import java.util.*; 

    class ProfitPercentage {
                
    public static void main(String...arg) {
                
    Scanner pp = new Scanner(System.in);
    System.out.println("Enter the number of dozens of toys purchased");
    int x = Integer.parseInt(pp.nextLine());
    System.out.println("Enter the price per dozen");
    int y = Integer.parseInt(pp.nextLine());
    System.out.println("Enter the selling price of 1 toy");
    int z = Integer.parseInt(pp.nextLine());
                                
    float cost;
     float profit;
    float profitPercentage;
                                
    cost=y/12f;
    profit=z-cost;
    profitPercentage=profit/cost*100;
                                
    System.out.println("cost "+cost );
    System.out.println("profit "+profit );
    System.out.println("Sam's profit percentage is "+profitPercentage );
                }
    }