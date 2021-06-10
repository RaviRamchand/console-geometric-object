package geometricObject;
import java.util.Scanner;

public class PrintShape {
	public static void main(String []args) {
		//Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("------------------");
		System.out.println("Geometric Objects");
		System.out.println("------------------");		
		System.out.println("1) Circle");
		System.out.println("2) Rectangle");
		System.out.println("------------------");
		
		System.out.print("Enter the number of the shape you want to configure: ");
		int choice = input.nextInt();
		
		//Create object
		PrintShape newShape = new PrintShape();
		
		//Access the createShape method with the choice and input scanner parameters
		newShape.createShape(choice, input);

		//End of main method
	}
	
	//Method to create and print the shape created
	public void createShape(int choice, Scanner input) {
		//Variables
		String colour;
		boolean filled;
		double radius, width, height;
		
		//If user input == 1 -> create a circle if input == 2 -> create rectangle
		if(choice == 1) {
			System.out.print("Enter the colour of the circle: ");
			colour = input.next();
			System.out.print("Do you want the circle to be filled? (yes = true/no = false): ");
			filled = input.nextBoolean();
			System.out.print("Enter the radius for the circle: ");
			radius = input.nextDouble();
			
			//Create a circle object with the user input			
			Circle circ = new Circle(colour, filled, radius);
			
			System.out.println("");
			
			System.out.print("Circle created on: ");
			System.out.println(circ.getDateCreated());
						
			circ.printCircle();
		}
		else if(choice == 2) {
			
			System.out.print("Enter the colour of the Rectangle: ");
			colour = input.next();
			System.out.print("Do you want the circle to be filled? (yes = true/no = false): ");
			filled = input.nextBoolean();
			System.out.print("Enter the width for the circle: ");
			width = input.nextDouble();
			System.out.print("Enter the height for the circle: ");
			height = input.nextDouble();
			
			//Create a circle object with the user input
			Rectangle rec = new Rectangle(colour, filled, width, height);
			
			System.out.println("");
			
			System.out.print("Rectangle created on: ");
			System.out.println(rec.getDateCreated());			
			
			System.out.println(rec.toString() +". Has the area of " +rec.getArea() +", perimeter of " +rec.getPerimeter());				
		}
		
		//End of createShape method
	}
	
	//End of PrintShape class
}
