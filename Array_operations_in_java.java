import java.util.Scanner;

public class Array_operations_in_java 
{
	public static void SumEle(int [] Arr,int si)
	{
		int sum=0;
		for(int i=0;i<=si-1;i++)
		{
			sum = sum+Arr[i];
		}
		System.out.println("Sum of Elements is : "+sum);
		return;
	}
	
	public static void SearchEle(int [] Arr,int k,int si)
	{
		
		for( int i=0;i<=si-1;i++)
		{
			if(Arr[i]==k)
			{
				System.out.println( k +" present in Array at position : "+(i+1));
				return;
			}
		}
		System.out.println(k + " is not present in Array" );
		
		return;
	}
	public static void MaxEle(int [] Arr,int si)
	{
		int k = Arr[0];
		for(int i=0;i<=si-1;i++)
		{
			if(Arr[i]>k)
			{
				k=Arr[i];
			}
		}
		System.out.println("Max Element : "+k);
		return;
	}
	public static void SortEle(int [] Arr,int si)
	{
		int k,a;
		for(int i=0;i<=(si-2);i++)
		{
			k = i;
			for(int j = i+1;j<=si-1;j++)
			{
				if(Arr[k]>Arr[j])
				{
					k=j;
				}
			}
			a=Arr[k];
			Arr[k]=Arr[i];
			Arr[i]=a;
		}
		print(Arr,si);
	}
	public static int InsertEle(int [] Arr, int k,int a,int si)
	{
	  
		for(int i=si;i>=(k);i--)
		{
			Arr[i]=Arr[i-1];
		}
		Arr[k-1]=a;
		
		
		return(si+1);
	}
   public static int DeleteEle(int [] Arr,int a,int si)
   {
	   int j=0;
	  for(int i = 0;i<=si-1;i++)
	  {
		  if(a!=Arr[i])
		  {
			  Arr[j]=Arr[i];
			  j++;
		  }
	  }
	  return(si-1);
   }
   public static void print(int [] Arr,int si)
   {
	   for(int i=0;i<=(si-1);i++)
	   {
		   System.out.print(Arr[i]+" ");
	   }
	   System.out.print("\n");
   }
	public static void main(String[] args)
	{
		int n,ele,pos;
		Scanner input  = new Scanner(System.in);
		System.out.print("Enter size of the array : ");
		n = input.nextInt();
		int Arr[] = new int[n+100];
		System.out.print("Enter "+n+"elements in the array\n");
		for(int i=0;i<=(n-1);i++)
		{
			Arr[i] = input.nextInt();
		}
		int ans=1;
		System.out.print("Enter :\n1 for sum of all elements\n2 to search an element\n3 to find the maximum element\n");
		System.out.print("4 to sort the array\n5 to insert an element\n6 to delete an element\n7 to print the array\n");
		do {
		int c;
		System.out.print("Enter your choice :");
		c = input.nextInt();
		switch(c)
		{
		case 1:
			SumEle(Arr,n);
			break;
		case 2:
			System.out.print("Enter the element you want to search : ");
			ele = input.nextInt();
			SearchEle(Arr,ele,n);
			break;
		case 3:
			MaxEle(Arr,n);
			break;
		case 4:
			SortEle(Arr,n);
			break;
		case 5:
			System.out.print("Enter the element you want to insert and the position respectively : ");
		    ele = input.nextInt();
			pos = input.nextInt();
			n = InsertEle(Arr,pos,ele,n);
			break;
		case 6:
			System.out.print("Enter the element you would like to delete : ");
			ele = input.nextInt();
			n = DeleteEle(Arr,ele,n);
			break;
		case 7:
			print(Arr,n);
			break;
		default:
			System.out.print("Invalid Input\n");
		}
		System.out.print("Would you like to continue?\nEnter 0 to exit : ");
		ans=input.nextInt();
		}
		while(ans!=0);
	}

}
