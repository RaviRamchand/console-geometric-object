package geometricObject;
import java.util.Date;

public class GeometricObject {
	//Fields
	private String _colour;
	private boolean _filled;
	private Date _dateCreated;
	
	//Constructors 
	public GeometricObject() {
		_dateCreated = new java.util.Date();
	}
	
	public GeometricObject(String colour, boolean filled) {
		this._colour = colour;
		this._filled = filled;
		_dateCreated = new java.util.Date();
	}
	
	//Getters and Setters
	public String getColour() {
		return _colour;
	}
	
	public void setColour(String colour) {
		this._colour = colour;
	}
	
	public boolean isFilled() {
		return _filled;
	}
	
	public void setFilled(boolean filled) {
		this._filled = filled;
	}
	
	public java.util.Date getDateCreated() {
		return _dateCreated;
	}
	
	@Override
	public String toString() {
		String str;
		if(isFilled() == true) {
			str = "Colour is " +getColour() +" and is filled";
		}
		else {
			str = "Colour is " +getColour() +" and is not filled";
		}
		
		return str;
	}
	
	
	//End of GeometricObject class
}
