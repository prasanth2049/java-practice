
import java.util.*; 

    class Replace{

  public static void main(String...arg) {

          Scanner rep = new Scanner(System.in);
		  System.out.println("Enter the content of the document:");
          String content = rep.nextLine();
		  
          System.out.println("Enter the old name ");
          String oldname= rep.nextLine();
		  
          System.out.println("Enter the new name");
          String newname = rep.nextLine();
		  
          String str = content.replace(oldname,newname);                      
          System.out.println("String after replace: " +str);
  }
}

             
 
