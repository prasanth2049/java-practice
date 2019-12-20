
public class Square extends shape{
	private int side;
	
	public Square(int side) {
		super("Square");
		this.side = side;
	}
	
	@Override
	public double calculateArea() {
		return side*side;
	}

}
