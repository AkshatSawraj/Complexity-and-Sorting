package Shapes3D;

public class SquarePrism extends Prism {
	private double height;
	private double side;

	public SquarePrism(double height, double side) {
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
		double area = Math.pow(side, 2);
		
		return area;
	}

	@Override
	public String toString() {
		return "SquarePrism [height=" + height + ", side=" + side + "]";
	}



}
