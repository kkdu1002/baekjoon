// https://www.acmicpc.net/problem/9086
package baekjoon;

import java.util.Scanner;

public class first_end_alpa 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String str;
		int num  = Integer.parseInt(input.nextLine());
		for(int i = 0; i < num; i++)
		{
			str = input.nextLine();
			System.out.printf("%s%s\n",str.charAt(0),str.charAt(str.length()-1));
		}
	}
}