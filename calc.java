import java.util.Scanner;
public class calc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the First number : ");
		double a,b;
		a=input.nextDouble();
		System.out.print("Enter the Second number : ");
		b=input.nextDouble();
		System.out.println("Addition : "+(a+b)+"\nSubtraction : "+(a-b));
		System.out.println("Multiplication : "+(a*b)+"\nDivision : "+(a/b));
	}

}
