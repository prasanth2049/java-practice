import java.util.Scanner;
public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("1. rectangle");
	    System.out.println("2. Square");
	    System.out.println("3. Circle");
	     System.out.println("Area Calculator --- Choose your shape");
	     int opt = Integer.parseInt(sc.nextLine());
	     Shape shape=null;
	     
	     if(opt==1)
	    	 System.out.println("Enter length and breadth:");
	     int len = Integer.parseInt(sc.nextLine());
	     int bre = Integer.parseInt(sc.nextLine());
	     shape = new rectangle(len, bre);
	}else if(opt==2) {
		 System.out.println("Enter side: ");
		 int side = Integer.parseInt(sc.nextLine());
		 shape = 
		
	}   

}
