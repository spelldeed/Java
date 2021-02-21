import java.util.Scanner;
public class Check_numbersystem {

	public static void main(String[] args) 
	{
/*can take int input then use string = intname+""-->intvar_name+emptystring 
 * or valueof(int_var_name)
 */
    Scanner input= new Scanner(System.in);
    int ans=0;
    int c;
    do {

    System.out.print("Enter the number : ");
    String s = input.next();
    String a ="to check if it is ";
    System.out.print("Check THe number System\nEnter :\n1 "+a+"Binary\n2 "+a+"Octal\n3 "+a+"Hexadecimal\n4 "+a+"Decimal\n");
    System.out.print("Enter your choice : ");

    c = input.nextInt();
    switch(c)
    {
    case 1:
        if(s.matches("[01]*"))
          {
    	     System.out.println("The entered number is binary");
          }
        else
          {
        	 System.out.println("The entered number is not binary");
          }
        break;
    case 2:
        if(s.matches("[0-7]*"))
          {
    	     System.out.println("The entered number ");
          }
        else
          {
      	     System.out.println("The entered number is not Octal");
          }
      break;
    case 3:
        if((s.matches("[0-9A-F]*")))
          {
    	     System.out.println("The entered number is Hexadecimal");
          }
        else
          {
    	     System.out.println("The entered number is not Hexadecimal");
          }
        break;
    case 4:
        if(s.matches("\\d*"))
        {
    	      System.out.println("The entered number is Decimal");
        }
        else
        {
    	     System.out.println("The entered number is not Decimal");
        }
       break;
    default:
    	System.out.println("Invalid input\n");
    }
    System.out.print("Would you like to continue ?\nEnter 1 for yes else press any other key :");
	ans=input.nextInt();
    }while(ans==1);
    
	}

}
