import java.util.*;
class stackUnderflow extends Exception
{
	public String toString()
	{
		return("Stack is empty\n");
	}
}
class stackOverflow extends Exception
{
	public String toString()
	{
		return("Stack is Full\n");
	}
}
class sub
{
	public int size;
	public int arr[];
    static int cnt=-1;
	sub(int n)
	{
		size = n;
	    arr = new int[size];
	}
	public void push(int k) throws stackOverflow
	{
		if(cnt==size-1)
			throw new stackOverflow();
		cnt++;
		arr[cnt]=k;
		
	}
	public void pop() throws stackUnderflow
	{
		if(cnt==-1)
			throw new stackUnderflow();

		System.out.print("Element at top : "+arr[cnt]+"\n");
		cnt--;
	}
	public void print() throws stackUnderflow
	{
		if(cnt==-1)
			throw new stackUnderflow();
		for(int i=0;i<=(cnt);i++)
			System.out.print(arr[i]+" ");
	}
}
public class Stack {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("Enter Size Of the Stack : ");
		n = input.nextInt();
		sub s = new sub(n);
		int ans=1,c,k;
		System.out.print("Enter :\n1 to enter an element in the stack\n2 to delete an element from the stack\n");
		do
		{
			System.out.print("\nEnter your choice : ");
			c = input.nextInt();
			switch(c)
			{
			case 1:
				System.out.print("\nEnter the element you want to insert : ");
				k = input.nextInt();
				try
				{
				  s.push(k);
				}
				catch(stackOverflow st)
				{
					System.out.print(st);
				}
				break;
			case 2:
				try
				{
				    s.pop();
				}
				catch(stackUnderflow st)
				{
					System.out.print(st);
				}
				break;
			default:
				System.out.print("\nInvalid choice\n");
			}
			System.out.print("\nEnter 0 to stop : ");
			ans = input.nextInt();
		}while(ans!=0);
		try
		{
        s.print();
		}
		catch(stackUnderflow st)
		{
			System.out.print(st);
		}
	}

}
