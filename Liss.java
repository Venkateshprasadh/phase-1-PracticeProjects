

import java.util.Scanner;

public class Liss 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of array elements");
		int n=sc.nextInt();
		System.out.println("enter array elements");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int ss[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ss[i]=1;
		}
		ss[0]=1;
		for(int i=1;i<n;i++)
		{
			ss[i]=1;
			for(int j=0;j<i;j++)
			{
				if((arr[i]>arr[j]) && ss[i]<=ss[j])
				{
					ss[i]=1+ss[j];
				}
			}
		}
		int max=0;
		for(int i=0;i<ss.length;i++)
		{
			if(max<ss[i])
			{
				max=ss[i];
			}
		}
		System.out.println("the longest increasing subsequence is "+max);
	}
}
