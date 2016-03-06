//1.) Create a java class Circle that contains x, y coordinates of the point where it is located and the radius of it.
//Add double member to store the area of the circle named area.
//2.) Initialize the coordination in constructor.
//3.) Add getter/setter methods for attributes (x,y,r)
//4.) Create a method to get back the area of the circle instance. The area is calculated lazily loosly 
//( only when method is called). The method name should be getArea():double
//5.) Make the Circle class to be serizable.

package common;

import java.io.IOException;
import java.io.Serializable;

public class Circle implements Serializable {

	private static final long serialVersionUID = 8290792504156957976L;

	private int x;
	private int y;
	private int r;
	private double area;

	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public double getArea() {
		return (this.r * this.r) * Math.PI;
	}

	public static void main(String[] args) throws IOException {

		Circle circle1 = new Circle(2, 3, 4);

		// ObjectOutputStream oos = new ObjectOutputStream(new
		// FileOutputStream(new File("circle.ser"), true));
		// oos.writeObject(circle1);
		// oos.close();

		System.out.println(circle1.getArea());

	}
}
