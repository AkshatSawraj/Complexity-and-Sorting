package Shapes3D;

public abstract class  Prism extends Shape{
	private double side;
	
	public Prism(double height, double side) {
		super(height);
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
}
