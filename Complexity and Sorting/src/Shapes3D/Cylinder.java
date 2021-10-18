package Shapes3D;

public class Cylinder extends Shape{
	
	private double radius;
	private double height;
	
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Cylinder(double height, double radius) {
		super(height);
		this.height = height;
		this.radius = radius;
	}

	
	
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		double volume = Math.PI * (Math.pow(radius, 2)) * height;
		
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
		return "Cylinder [radius=" + radius + ", height=" + height + "]";
	}



}
