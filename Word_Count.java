// https://www.acmicpc.net/problem/1152
package baekjoon;

import java.util.Scanner;

public class Word_Count 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String s = input.nextLine();
		int count = 0;
		for(int i = 0; i < s.length() ; i++)
		{
			if(s.charAt(i) == ' ')
			{
				count++;
			}
		}
		if(s.charAt(0) != ' ')
		{
			count++;
		}
		System.out.print(count);
	}
}