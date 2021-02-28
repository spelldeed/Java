import java.util.Scanner;
public class GCD {
	static int max(int a,int b)
	{
		if(a>b)
			return(a);
		return(b);
	}
	static int min(int a,int b)
	{
		if(a>b)
			return(b);
		return(a);
	}
	static int GCD(int a,int b)
	{
		if(b==0)
			return(a);
		else
			return(GCD(b,a%b));
	}

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a and b :" );
		int a,b;
		a = input.nextInt();
		b = input.nextInt();
		System.out.print("The GCD of "+a+" and "+b+ " is :"+GCD(max(a,b),min(a,b)));
	}

}
