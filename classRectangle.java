package classRectangle;
import java.util.Scanner;
class Rectangle
{
	public double length;
	public double breadth;
	public double perimeter()
	{
		return(2*(length+breadth));
	}
	public double area()
	{
		return(length*breadth);
	}
	public boolean issquare()
	{
		return(length==breadth);
	}
}
public class classRectangle {
	

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Length and Breadth respectively : ");
		Rectangle r = new Rectangle();
		r.length = input.nextDouble();
		r.breadth = input.nextDouble();
		System.out.print(" Perimeter : "+r.perimeter()+"\n Area : "+r.area()+"\n Is it a Square ? "+r.issquare());
		

	}

}
