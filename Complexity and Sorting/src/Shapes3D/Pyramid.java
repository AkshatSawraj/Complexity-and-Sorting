package Shapes3D;

public class Pyramid extends Shape {
	private double side;
	private double height;
	
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Pyramid(double height, double side) {
		super(height);
		this.side = side;
		this.height = height;
	}

	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		double volume = (calcBaseArea() * height) / 3;
		
		return volume;
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		double area = Math.pow(side, 2);
		
		return area;
	}

	@Override
	public String toString() {
		return "Pyramid [side=" + side + ", height=" + height + "]";
	}



}
