package Shapes3D;

public class OctagonalPrism extends Prism{
private double height;
private double side;

	public OctagonalPrism(double height, double side) {
		super(height, side);
		this.height = height;
		this.side = side;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		double volume = calcBaseArea() * height;
		
		return volume;
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		double area = 2 * (1 + Math.sqrt(2)) * (Math.pow(side, 2));
		
		return area;
	}

	@Override
	public String toString() {
		return "OctagonalPrism [height=" + height + ", side=" + side + "]";
	}



}
