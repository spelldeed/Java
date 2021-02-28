import java.util.Scanner;
public class Prime_number {
	static boolean isPrime(int n)
	{
		if(n==1)
			return(false);
		else if((n%2==0)||(n%3==0))
		{
			return(false);
		}
		for(int i=5;i<=(n-1);i+=2)
		{
			if(n%i==0)
			{
				return(false);
			}
		}
		return(true);
	}

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The number you want to check : ");
		int n;
		n = input.nextInt();
		
		if(isPrime(n))
			System.out.print("The entered number is prime");
		else
		    System.out.print("The entered number is not prime");

	}

}
