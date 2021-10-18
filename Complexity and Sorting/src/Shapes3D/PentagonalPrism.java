package Shapes3D;

public class PentagonalPrism extends Prism {
	private double side;
	private double height;

	public PentagonalPrism(double height, double side) {
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
		double ang = Math.toRadians(54);
		double area = (5 * (Math.pow(side, 2)) * (Math.tan(ang)))/4;
		
		return area;
	}

	@Override
	public String toString() {
		return "PentagonalPrism [side=" + side + ", height=" + height + "]";
	}



}
