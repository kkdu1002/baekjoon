// https://www.acmicpc.net/problem/2675
package baekjoon;

import java.util.Scanner;

public class Repeat_Char 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		
		for(int i = 0; i < T ; i++)
		{
			int R = input.nextInt();
			String S = input.next();
			for(int j = 0 ; j < S.length() ; j++)
			{
				for(int k = 0 ; k < R ; k++)
				{
					System.out.printf("%s",S.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
