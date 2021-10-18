package Shapes3D;

public class Cone extends Shape{
	
	private double radius;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Cone(double height, double radius) {
		super(height);
		this.radius = radius;
	}

	
	
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		double volume = (Math.PI * (Math.pow(radius, 2)))/3;
		
		return volume;
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		double area = Math.PI * (Math.pow(radius, 2));
		
		return area;
	}

	@Override
	public String toString() {
		return "Cone [radius=" + radius + "]";
	}
	

}
