import java.util.*;
import java.math.*;
abstract class Shape
{
	abstract public void Perimeter();
	public void Area()
	{
		System.out.print("Area : ");
	}
	
}
class Circle extends Shape
{
	private int radius;
	Circle(int radius)
	{
		this.radius=radius;
	}
	public void Perimeter()
	{
		System.out.print("Circumference of circle : "+ Math.PI*2*radius);
		System.out.print("\n");
	}
	@Override
	public void Area()
	{
		System.out.print("Area of circle : "+Math.PI*radius*radius);
		System.out.print("\n");
	}
}
class Rectangle extends Shape
{
	private int length,breadth;
	Rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
	public void Perimeter()
	{
		System.out.print("Perimeter of rectangle : "+2*(length+breadth));
		System.out.print("\n");
	}
	@Override
	public void Area()
	{
		System.out.print("Area of rectangle : "+length*breadth);
		System.out.print("\n");
	}
}
class Square extends Shape
{
	private int side;
	Square(int side)
	{
		this.side=side;
	}
	public void Perimeter()
	{
		System.out.print("Perimeter of square : "+ 4*side);
		System.out.print("\n");
	}
	@Override
	public void Area()
	{
		System.out.print("Area of square : "+side*side);
		System.out.print("\n");
	}
}
class rightTriangle extends Shape
{
	private int base,height;
	Scanner input = new Scanner(System.in);
	rightTriangle()
	{
		base=1;
		height=1;
	}
	public void Triget()
	{
		System.out.print("Enter base and height for right angled triangle respectively : ");
		base = input.nextInt();
		height = input.nextInt();
	}
	public void Perimeter()
	{
		System.out.print("Perimeter of right angled triangle : "+ (height+base+Math.sqrt((height*height)+(base*base))));
		System.out.print("\n");
	}
	@Override
	public void Area()
	{
		System.out.print("Area of right angled triangle : "+0.5*base*height);
		System.out.print("\n");
	}
}
public class Shapes {

	public static void main(String[] args) 
	{
		System.out.print("Enter :\n1 for circle \n2 for rectangle\n3 for square\n4 for right angled triangle\n");
        int ans=1,c;
        Shape s;
        Scanner input = new Scanner(System.in);
        do
        {
        	int r,l,b,h;
        	
        	System.out.print("enter your choice : \n");
        	c = input.nextInt();
        	switch(c)
        	{
        	case 1:
        		System.out.print("\nEnter the radius for circle : ");
        		r = input.nextInt();
        		s = new Circle(r);
        		s.Perimeter();
        		s.Area();
        		break;
        	case 2:
        		System.out.print("\nEnter the length and breadth for rectangle respectively : ");
        		l = input.nextInt();
        		b=input.nextInt();
        		s = new Rectangle(l,b);
        		s.Perimeter();
        		s.Area();
        		break;
        	case 3:
        		System.out.print("\nEnter the side for square : ");
        		l = input.nextInt();
        		s = new Square(l);
        		s.Perimeter();
        		s.Area();
        		break;
        	case 4:
        		s = new rightTriangle();
        		rightTriangle t = new rightTriangle();
        		
        		System.out.print("\nFOR SHAPE CLASS REFERENCE :\n");
        		s.Perimeter();
        		s.Area();
        		System.out.print("\nFOR RIGHTTRIANGLE CLASS REFERENCE :\n");
        		t.Triget();
        		t.Perimeter();
        		t.Area();
        		break;
        	default:
        		System.out.print("\nInvalid Input\n");
        	}
        	System.out.print("\nWould you like to continue?\nEnter 0 to exit : ");
    		ans=input.nextInt();
        }while(ans!=0);
	}

}
