import java.util.*;

class Student
{
	Scanner input = new Scanner(System.in);
	public String name;
	public String rollno;
	public int Marks[] = new int[5];
	
	public void Input()
	{
		System.out.print("Enter :\nName : ");
		name = input.next();
		System.out.print("\nRoll no. : ");
		rollno = input.next();
		System.out.print("Enter best 5 marks : ");
		for(int i=0;i<=(4);i++)
		{
		     Marks[i] = input.nextInt();
		}
		
	}
	public double total()
	{
		double sum=0;
		for(int i=0;i<=(4);i++)
		{
		     sum = sum + Marks[i];
		}
		return(sum);
	}
	public double per()
	{
		return(total()/5);
	}
	public String grade()
	{
		double k=per();
		if(k>=90)
			return("A");
		else if(k>=75)
			return("B");
		else if(k>=60)
		    return("C");
		else if(k>=40)
			return("D");
		else
			return("E");	
	}
	public void display()
	{
		System.out.print(rollno+"\t"+name+"\t"+total()+"\t"+per()+"\t\t"+grade()+"\n");
	}
}
public class Studentclass 
{
	
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		Student s=new Student();
		
		s.Input();
		System.out.println("****************************INPUT SAVED SUCCESSFULLY*******************************");
		System.out.println("\n\n-----------------------DATA-------------------------------------------\n");
		System.out.println("Roll no\t\tName\tTotal\tPercentage\tGrade\n");
		s.display();
	}

}
