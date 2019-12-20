
import java.util.*;

class Show{
public float calculateProfit(int dozenCount, int pricePerDozen,  int sellPrice)
{

                float cp = pricePerDozen/12;
                float profit = sellPrice - cp ;
                float percentage = (profit/cp)*100;
                return percentage;
                
 }

}
