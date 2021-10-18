package Shapes3D;

public abstract class Shape implements Comparable<Shape>{
	private double height;
	
	public abstract double calcVolume();
	public abstract double calcBaseArea();
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Shape(double height) {
		super();
		this.height = height;
	}
	@Override
	public int compareTo(Shape o) {
		if (o.height>this.height) {
			return 1;
		} else if (this.height>o.height) {
			return -1;
		} else 
		{
			return 0;
		}
	}
}
