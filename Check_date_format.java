import java.util.Scanner;
public class Check_date_format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		System.out.println("Program to Check whether the entered date is in DD/MM/YYYY format?");
		int ans=0;
		do {
		System.out.println("Enter the date\n");
		String s=input.next();
		if(s.matches("[0-3][0-9]/[01][0-2]/[0-9]{4}"))
		{
			System.out.println("The entered date is in DD/MM/YYYY format\nThough can't comment on its validity\n");
		}
		else
		{
			System.out.println("The entered date is not in DD/MM/YYYY format");
		}
		System.out.print("Would you like to continue ?\nEnter 1 for yes else press any other key :");
		ans=input.nextInt();
		}while(ans==1);

	}

}
