package geometricObject;

public class Rectangle extends GeometricObject{
	
	//Fields
	private double _width;
	private double _height;

	//Constructor
	public Rectangle() {}
	
	public Rectangle(double width, double height) {
		this._height = height;
		this._width = width;
	}

	public Rectangle(String colour, boolean filled, double width, double height) {
		//Access the superclass constructor to set colour and filled;
		super(colour, filled);
		//Set height and width based on user input
		this._height = height;
		this._width = width;
	}
	
	//Setters and getters to access the private field variables
	public double getWidth() {
		return _width;
	}
	public void setWidth(double width) {
		this._width = width;
	}
	
	public double getHeight() {
		return _height;
	}
	
	public void setHeight(double height) {
		this._height = height;
	}
	
	//Other methods
	public double getArea() {
		return this._height * this._width;
	}
	
	public double getPerimeter() {
		return 2 * (this._height + this._width);
	}
	
	//End of Rectangle class
}
