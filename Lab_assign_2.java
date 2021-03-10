import java.util.*;
import java.math.*;
class CASES
{
	Scanner input = new Scanner(System.in);
	public void max_min(int [] arr,int n)
	{
		int max=0;
		int min= Integer.MAX_VALUE;
		for(int i=0;i<=(n-1);i++)
		{
			if(arr[i]>max)
				max = arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.print("The maximum value in array is : "+max+"\nThe minimum value in Array is : "+min);
		return;
	}
	public int new_size(ArrayList<Integer> a)
	{
		for(int i =0;i<=(a.size()-1);i++)
		{
			for(int j=i+1;j<=(a.size()-1);j++)
			{
				if(a.get(j)==a.get(i))
				{
					a.remove(j);
				}
					
			}
		}
		return(a.size());
	}
	public void EvenOdd(int n)
	{
		int Even[]=new int [100];
		int Odd[]=new int[100];
		int cnte=0,cnto=0;
		System.out.print("Enter "+n+" Element\n ");
		int a;
		for(int i=0;i<=(n-1);i++)
		{
			a = input.nextInt();
			if(a%2==0)
			{
				Even[cnte]=a;
				cnte++;
			}
			else
			{
				Odd[cnto]=a;
				cnto++;
			}	
		}
		System.out.print("Even Array : ");
		Print(Even,cnte);
		System.out.print("Odd Array : ");
		Print(Odd,cnto);
		return;
	}
	public int SmallestDistance(int [] arr,int n)
	{
		int min=Integer.MAX_VALUE;
		int index=0;
		for(int i=0;i<=n-2;i++)
		{
			if(Math.abs(arr[i]-arr[i+1])<min)
			{
				min=Math.abs(arr[i]-arr[i+1]);
				index=i;
			}
		}
		return(index);
	}
	public void Print(int [] arr,int s)
	{
		if(s==0)
		{
			System.out.print("Empty Array\n");
			return;
		}
		for(int i=0;i<=(s-1);i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
		return;
	}
}

public class Lab_assign_2 {
	

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		
		int ans=1,n,k;
		do
		{
			int Arr[] = new int[100];
			
			ArrayList<Integer> a = new ArrayList<Integer>();
			CASES m = new CASES();
			System.out.print("Enter : \n1 to get the minimum and maximum value in an array\n2 to remove duplicate elements and get the new size of an array\n3 to sort an array into even and odd array\n4 to get indices of consecutive element having minimum distance between them\n");
			System.out.print("\n\nEnter your choice : ");
			int c;
			c = input.nextInt();
			System.out.print("\nEnter number of elements you would like to enter : ");
			n = input.nextInt();
			switch(c)
			{
			case 1:
				System.out.print("Enter "+n+" Elements\n ");
				for(int  i=0;i<=(n-1);i++)
				{
					Arr[i]=input.nextInt();
				}
				m.max_min(Arr,n);
				break;
			case 2:
				while(n!=0)
				{
					k =input.nextInt();
					a.add(k);
					n--;
				}
				System.out.print("New size of Array : "+m.new_size(a));
				break;
			case 3:
				m.EvenOdd(n);
				break;
			case 4:
				System.out.print("Enter "+n+" Elements\n ");
				for(int  i=0;i<=(n-1);i++)
				{
					Arr[i]=input.nextInt();
				}
				System.out.print("Smallest Distance is between elements at index "+m.SmallestDistance(Arr, n)+" and "+(m.SmallestDistance(Arr, n)+1));
				break;
			default:
				System.out.print("Invalid input");
				
			}
			System.out.print("\nWould you like to continue? enter 0 to stop : ");
			ans = input.nextInt();
		}while(ans!=0);

	}

}
