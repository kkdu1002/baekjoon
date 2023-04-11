package baekjoon;

import java.util.Scanner;

public class rest 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int A[] = new int [10];
		int result = 0;
		
		for(int i = 0 ; i < A.length; i++)
		{
			A[i] = (input.nextInt() % 42);
		}
		
		for(int i = 0; i < A.length; i++)
		{
			int count = 0;
			for(int j = i + 1; j < A.length;j++)
			{
				if(A[i] == A[j])
				{
					count++;
				}
			}
			if(count == 0) {
				result++;
			}
		}
		System.out.print(result);
	}
}