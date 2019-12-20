import java.util.*; 

class CompareInteger {
                
                public static void main(String...arg) {
                
    Scanner CI = new Scanner(System.in);
    System.out.println("Enter X : ");
    int x = Integer.parseInt(CI.nextLine());
    System.out.println("Enter Y :" );
     int y = Integer.parseInt(CI.nextLine());
   
	
	if(x<y) {
	System.out.println(x+" is less than  "+y);
	}
	else if(y<x) {
	System.out.println(x+" is greater than "+y);
	}
	else
	System.out.println(x+" is equal to "+y);
	}
	}
	
	
	