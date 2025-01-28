package part1.ex2;

public class Rectangle {

	private float length;
	private float width;

	public Rectangle () {
		length = 1.0f;
		width = 1.0f;
	}
	
	public Rectangle (float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	public float getLength() {
		return length;
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public float getWidth() {
		return width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	public double getArea() {
		double area = length * width;
		return area;
	}
	
	public double getPerimeter() {
		double P = 2*(length + width);
		return P;
	}
	
	public String toString() {
		return "Rectangle[length=" + length + ",width=" + width + "]";
	}
}
