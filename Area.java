import java.util.Scanner;

class Rectangle	{
  int m_width;
  int m_height;
 
  public Rectangle(int width, int height)	{
    m_width = width;
    m_height = height;
  }
 
  public void setWidth(int width)	{
    m_width = width;
  }
 
  public void setHeight(int height)	{
    m_height = height;
  }
 
  public int getWidth()	{
    return m_width;
  }
 
  public int getHeight()	{
    return m_height;
  }
 
  public int getArea()	{
    return m_width * m_height;
  }
}
//this class extends the Rectangle class to find the area of square
class Square extends Rectangle {
  public Square(int side) {
    super(side, side);
  }
}

public class Area	{
  public static int calculateArea(Rectangle dimensions)	{
    return dimensions.getArea();
  }

  public static void main(String[] args)	{
  	System.out.println("Choose 1 to find the area of rectangle: ");
  	System.out.println("Choose 2 to find the area of square: ");
  	System.out.println("Enter a choice");
  	Scanner input = new Scanner(System.in);
  	int choice = input.nextInt();
  	
  	switch(choice)	{
  		case 1:
  			System.out.println("Enter length of Rectangle: ");	
  			Scanner rectangleLength = new Scanner(System.in);
  			int length = rectangleLength.nextInt();
  			System.out.println("Enter breadth of Rectangle: ");
  			Scanner rectangleBreadth = new Scanner(System.in);
  			int breadth = rectangleBreadth.nextInt();
    		Rectangle dimensions = new Rectangle(length, breadth);
    		System.out.println("Area of Rectangle = " + calculateArea(dimensions));
    		break;
    		
 		case 2:
 			System.out.println("Enter length of side of Square: ");
  			Scanner squareEdge = new Scanner(System.in);
  			int side = squareEdge.nextInt();
    		Square squareSide = new Square(side);
    		System.out.println("Area of Square = " + calculateArea(squareSide));
    		break;
    	
    	default:
    		System.out.println("!!! Please choose either 1 or 2 !!!");
	    	break;
  		}
	}
}

