package gmail_or_not;
import java.util.Scanner;
public class gmail_or_not {

	public static void main(String[] args)
	{
	   Scanner input=new Scanner(System.in);
	   int ans=0;
	   do {
	   System.out.print("Enter a valid mail ID : ");
	   String s;
	   s=input.next();
	   int i = s.indexOf('@');
	   String user,extension;
	   extension = s.substring(i+1);
	   user=s.substring(0, i);
	   if(extension.startsWith("gmail"))
	   {
		   System.out.println("Yes the entered mail ID is a gmail account\nUsername is : "+user);
	   }
	   else
	   {
		   System.out.println("No,The entered mail ID is not a gmail account\nUsername is : "+user+"\nDomain is : "+extension);
	   }
	   System.out.print("Would you like to continue ?\nEnter 1 for yes else press any other key :");
	   ans=input.nextInt();
	   }while(ans==1);
		   
       input.close();


	}

}
