package string_remove;
import java.util.Scanner;
public class string_remove {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int ans=0;
		do
		{
		System.out.println("Enter the string : ");
		String s;
		
		s=input.nextLine();
		System.out.println("After removing Special character :");
		s = s.trim();
		s = s.replaceAll("\\s+","");
		s = s.replaceAll("[^A-Za-z0-9]","");
		System.out.println(s);
		System.out.print("Would you like to continue ?\nEnter 1 for yes else press any other key :");
		ans=input.nextInt();
		}while(ans==1);
		

	}

}
