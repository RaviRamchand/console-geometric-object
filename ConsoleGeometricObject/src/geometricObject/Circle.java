package geometricObject;

public class Circle extends GeometricObject{
	//Fields
	private double _radius;

	//Constructors
	public Circle() {}

	public Circle(double radius) {
		this._radius = radius;
	}

	public Circle(String colour, boolean filled, double radius) {
		//Access the superclass constructor to set colour and filled;
		super(colour, filled);
		//Set radius to the users input
		this._radius = radius;
	}

	//Setters and getters to access the private field variables
	public double getRadius() {
		return _radius;
	}	

	public void setRadius(double radius) {
		this._radius = radius;
	}

	//Other methods

	public double getArea() {
		return this._radius * this._radius * Math.PI;
	}

	public double getPerimeter() {
		return 2 * this._radius * Math.PI;
	}

	public double getDiameter() {
		return 2 * this._radius;
	}

	//Print out the properties of the circle 
	public void printCircle() {
		System.out.printf(toString() +". Has the area of %.2f, perimeter of %.2f and the diameter of %.2f"
				, getArea(), getPerimeter(), getDiameter());
	}
	//End of Circle class
}
