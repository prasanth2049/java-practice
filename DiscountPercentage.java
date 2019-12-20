import java.util.*; 

class DiscountPercentage {
                
                public static void main(String...arg) {
                
    Scanner dp = new Scanner(System.in);
    System.out.println("Price of item 1 : ");
    float x = Float.parseFloat(dp.nextLine());
    System.out.println("Price of item 2 :" );
    float y = Float.parseFloat(dp.nextLine());
    System.out.println("Discount in percentage : ");
    float z = Float.parseFloat(dp.nextLine());
                                
    float total;
    float discountamount;
    float savedamount;
                                
    total = x+y;
    savedamount =total/100*z;
    discountamount = total-savedamount;
                                
                                
    System.out.println("Total amount : $ "+total );
    System.out.println("Discounted amount : $ "+discountamount );
    System.out.println("Saved amount : $ "+savedamount );
                }
}
