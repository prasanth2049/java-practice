
import java.util.Scanner;

public class InstanceOfProduct extends Product {

       public static void main(String[] args) {
          Product pro = new Product();

          
          
              Scanner sc = new Scanner(System.in);
             
              System.out.print("Enter product Id \n");
              long id = Integer.parseInt(sc.nextLine());
              pro.setId(id);
              
              System.out.println("Enter the product name");
              pro.setProductName(sc.nextLine());
              
              System.out.println("Enter the supplier name");
              pro.setSupplierName(sc.nextLine());
              pro.display(); 
       }
        
}
