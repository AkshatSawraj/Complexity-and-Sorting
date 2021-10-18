package Shapes3D;

public class TriangularPrism extends Prism {
	private double height;
	private double side;
	
	public TriangularPrism(double height, double side) {
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
		double area = (Math.pow(side, 2) * (Math.cbrt(3)))/4;
		
		return area;
	}

	@Override
	public String toString() {
		return "TriangularPrism [height=" + height + ", side=" + side + "]";
	}

	

}
