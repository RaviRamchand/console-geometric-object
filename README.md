# console-geometric-object
ConsoleGeometricObject is a console based application created to practice inheritance. This project has four classes. GeometricObject.java, Circle.java, 
Rectangle.java and lastly PrintShape.java. This project was taken from a UML diagram from "Introduction to Java Programming and Data Structures eleventh edition" by 
Y. Daniel Liang. The UML diagram is located at the end of this document. 

## ClassDescription
GeometricObject.java is the superclass in this project that provides the basic information of a created shape. This class has colour, filled and date attributes that can 
be accessed and changed through the getters and setters provided, as well as a toString method that could be called to print out the colour and fill of the shape.

Circle.java is a subclass of GeometricObject.java that lets a user create a circle. It has a radius attribute that will find the area, perimeter and diameter of the circle and can change colour or filling through the super constructor.

Rectangle.java is another subclass of GeometricObject.java that lets a user create a rectangle. It has a with and height attribute that will find the area and the perimeter of the rectangle and can change colour or filling through the super constructor.

PrintShape.java is the class that has the main method in this project. Users would be able to create a shape from this class and have the output displayed to them 
from a console.

## Shape Creation Demonstration

Circle:<br>
![Circle creation](https://github.com/Tripl3R/console-geometric-object/blob/master/circle.PNG?raw=true)

Rectangle:<br>
![Rectangle creation](https://github.com/Tripl3R/console-geometric-object/blob/master/rectangle.PNG?raw=true)

## UML Diagram from Introduction to Java Programming and Data Structures by Y. Daniel Liang
![UML Diagram](https://github.com/Tripl3R/console-geometric-object/blob/master/uml.PNG?raw=true)
