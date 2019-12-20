
public class Rectangle extends shape{
	private int length;
	private int breadth;
	public rectangle(int length, int breadth) {
       super("Rectangle");
       this.length = length;
       this.breadth = breadth;
	}
	@Override
	public double calculateArea() {
		return length*breadth;
       
	}
}
	
     

