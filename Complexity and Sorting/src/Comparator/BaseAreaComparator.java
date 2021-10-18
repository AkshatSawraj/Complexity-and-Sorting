package Comparator;

import java.util.Comparator;

import Shapes3D.Shape;


public class BaseAreaComparator implements Comparator<Shape>{

	@Override
	public int compare(Shape o1, Shape o2) {
		if (o1.calcBaseArea() < o2.calcBaseArea()) {
			return 1;
		} else if (o1.calcBaseArea() > o2.calcBaseArea()) {
			return -1;
		} else 
		{
			return 0;
		}
	}

}
