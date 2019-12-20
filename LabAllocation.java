import java.util.*; 

class LabAllocation {
                
                public static void main(String...arg) {
                
    Scanner LA = new Scanner(System.in);
    System.out.println("Enter X : ");
    int x = Integer.parseInt(LA.nextLine());
    System.out.println("Enter Y :" );
     int y = Integer.parseInt(LA.nextLine());
    System.out.println("Enter Z : ");
    int z = Integer.parseInt(LA.nextLine());
	
	if(x<y && x<z) {
	System.out.println("L1 has the minimal capacity");
	}
	else if(y<z) {
	System.out.println("L2 has the minimal capacity");
	}
	else
	System.out.println("L3 has the minimal capacity");
	}
	}
	
	
	