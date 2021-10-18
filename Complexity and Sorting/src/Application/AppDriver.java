package Application;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

import Comparator.*;
import Shapes3D.Shape;
import Utilities.Utility;

public class AppDriver {

	public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {
		
		String sortingType;
		String fileName=null;
		Comparator compareType=null;
		Utility util = new Utility();
		TestingApp testApp = null;
		
		
		for (String arg : args){
			if(arg.startsWith("-") || arg.startsWith("–")) {
				if(arg.charAt(1)=='F' || arg.charAt(1)=='f') {
					fileName=arg.substring(2);
					 testApp = new TestingApp(fileName);
					
				}
				else if(arg.charAt(1)=='t'||arg.charAt(1)=='T') {
					if(arg.charAt(2)=='h' || arg.charAt(2)=='H') {
						compareType=null;
					}
					else if(arg.charAt(2)=='v' || arg.charAt(2)=='V') {
						
						compareType=new VolumeComparator();
					}
					else if(arg.charAt(2)=='a' || arg.charAt(2)=='A') {
						compareType=new BaseAreaComparator();
					}
				}
				else if(arg.charAt(1)=='s'||arg.charAt(1)=='S') {
					if(arg.charAt(2)=='b' || arg.charAt(2)=='B') {
						sortingType="Bubble Sort";
						System.out.println(sortingType);
						
						util.bubbleSort(testApp.getShapes(), compareType);
					}
					else if(arg.charAt(2)=='s' || arg.charAt(2)=='S') {
						sortingType="Selection  Sort";
						util.selectionSort(testApp.getShapes(), compareType);
					}
					else if(arg.charAt(2)=='i' || arg.charAt(2)=='I') {
						sortingType="Insertion  Sort";
						util.insertionSort(testApp.getShapes(), compareType);
					}
					else if(arg.charAt(2)=='m' || arg.charAt(2)=='M') {
						sortingType="Merge Sort";
						util.mergeSort(testApp.getShapes(), compareType);
					}
					else if(arg.charAt(2)=='q' || arg.charAt(2)=='Q') {
						sortingType="Quick Sort";
						util.quickSort(testApp.getShapes(), compareType);
					}
					else if(arg.charAt(2)=='x' || arg.charAt(2)=='X') {
						sortingType="Heap Sort";
						util.heapSort(testApp.getShapes(), compareType);
					}
				}
			}
			
			else {
				continue;
			}
		}
	}
}
//java -jar sort.jar –fpolyfor1.txt –Tv –Sb
//java -jar sort.jar –ta –sQ –fpolyfor3.txt
//java -jar sort.jar –tH –Fpolyfor5.txt –sB
