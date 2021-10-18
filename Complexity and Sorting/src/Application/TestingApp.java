package Application;


import java.io.File;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;


import Shapes3D.*;


public class TestingApp {
	private Shape[] shapes;
	private String fileName;
	
	public TestingApp(String file) throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		this.fileName=file;
		createShapesArray();
	}
	
	private void createShapesArray() throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		File file=new File(fileName);
        try (Scanner input = new Scanner(file)) {
			int size=input.nextInt();
			shapes=new Shape[size];
			int index=0;
			Object o = null;
			
			
			while(input.hasNext()){
				
				String shapeName=input.next();
				
				
				double d1=input.nextDouble();
				double d2=input.nextDouble();
				
				String className = "Shapes3D."+shapeName;
				
				Class cls = Class.forName(className);
				
				if(className.compareTo("Shapes3D.Cylinder")==0)
				{
					Class paramTypes[] = new Class[2];
					paramTypes[0] = Double.TYPE;
					paramTypes[1] = Double.TYPE;
					
					Constructor ct = cls.getConstructor(paramTypes);
					
					Object argList[] = new Object[2];
					argList[0] = new Double(d1);
					argList[1] = new Double(d2);
					
					o = ct.newInstance(argList);
				}
				else if(className.compareTo("Shapes3D.Cone") == 0)
				{
					Class paramTypes[] = new Class[2];
					paramTypes[0] = Double.TYPE;
					paramTypes[1] = Double.TYPE;
					
					Constructor ct = cls.getConstructor(paramTypes);
					
					Object argList[] = new Object[2];
					argList[0] = new Double(d1);
					argList[1] = new Double(d2);
					
					o = ct.newInstance(argList);
				}
				else if(className.compareTo("Shapes3D.Pyramid") == 0)
				{
					Class paramTypes[] = new Class[2];
					paramTypes[0] = Double.TYPE;
					paramTypes[1] = Double.TYPE;
					
					Constructor ct = cls.getConstructor(paramTypes);
					
					Object argList[] = new Object[2];
					argList[0] = new Double(d1);
					argList[1] = new Double(d2);
					
					o = ct.newInstance(argList);
				}
				else if(className.compareTo("Shapes3D.OctagonalPrism") == 0)
				{
					Class paramTypes[] = new Class[2];
					paramTypes[0] = Double.TYPE;
					paramTypes[1] = Double.TYPE;
					
					Constructor ct = cls.getConstructor(paramTypes);
					
					Object argList[] = new Object[2];
					argList[0] = new Double(d1);
					argList[1] = new Double(d2);
					
					o = ct.newInstance(argList);
				}
				else if(className.compareTo("Shapes3D.PentagonalPrism") == 0)
				{
					Class paramTypes[] = new Class[2];
					paramTypes[0] = Double.TYPE;
					paramTypes[1] = Double.TYPE;
					
					Constructor ct = cls.getConstructor(paramTypes);
					
					Object argList[] = new Object[2];
					argList[0] = new Double(d1);
					argList[1] = new Double(d2);
					
					o = ct.newInstance(argList);
				}
				else if(className.compareTo("Shapes3D.SquarePrism") == 0)
				{
					Class paramTypes[] = new Class[2];
					paramTypes[0] = Double.TYPE;
					paramTypes[1] = Double.TYPE;
					
					Constructor ct = cls.getConstructor(paramTypes);
					
					Object argList[] = new Object[2];
					argList[0] = new Double(d1);
					argList[1] = new Double(d2);
					
					o = ct.newInstance(argList);
				}
				else if(className.compareTo("Shapes3D.TriangularPrism") == 0)
				{
					Class paramTypes[] = new Class[2];
					paramTypes[0] = Double.TYPE;
					paramTypes[1] = Double.TYPE;
					
					Constructor ct = cls.getConstructor(paramTypes);
					
					Object argList[] = new Object[2];
					argList[0] = new Double(d1);
					argList[1] = new Double(d2);
					
					o = ct.newInstance(argList);
				}
				
				shapes[index]=((Shape)o);
				index++;
				
			}
			
		}
	}

	
	public Shape[] getShapes() {
		return shapes;
	}

	
}
