package part1.ex1;
/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle {  // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   
   // Constructors (overloaded)
   /** Constructs a Circle instance with default value for radius and color */
   public Circle() {  // 1st (default) constructor
       radius = 1.0;
       color = "red";
   }
   
   /** Constructs a Circle instance with the given radius and default color */
   public Circle(double r) {  // 2nd constructor
       radius = r;
       color = "red";
   }
   
   public Circle(double r, String color) {
	   radius = r;
	   this.color = color;
   }
   
   /** Returns the radius */
   public double getRadius() {
       return radius; 
   }

   /** Sets the radius */
   public void setRadius(double r) {
       radius = r; 
   }
   
   /** Returns the area of this Circle instance */
   public double getArea() {
       return radius*radius*Math.PI;
   }

   /** Returns the circumference of this Circle instance */
   public double getCircumference() {
       return 2*radius*Math.PI;
   }
   
   public String toString() {
	   return "Circle[radius=" + radius + "]";
   }
}
