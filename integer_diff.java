// https://www.acmicpc.net/problem/2908
package baekjoon;

import java.util.Scanner;

public class integer_diff 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String A , B;
		A = input.next();
		B = input.next();
		
		for(int i = 0; i < A.length(); i++)
		{
			if(A.charAt(2) > B.charAt(2))
			{
				System.out.print(A.charAt(A.length()- i - 1));
			}
			else if(A.charAt(2) == B.charAt(2))
			{
				if(A.charAt(1) > B.charAt(1))
				{
					System.out.print(A.charAt(A.length()- i - 1));
				}
				else if(A.charAt(1) == B.charAt(1))
				{
					if(A.charAt(0) > B.charAt(0))
					{
						System.out.print(A.charAt(A.length()- i - 1));
					}
					else
					{
						System.out.print(B.charAt(B.length()- i - 1));
					}
				}
				else
				{
					System.out.print(B.charAt(B.length()- i - 1));
				}
			}
			else
			{
				System.out.print(B.charAt(B.length()- i - 1));
			}
		}
	}
}