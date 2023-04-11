// https://www.acmicpc.net/problem/27866
package baekjoon;

import java.util.Scanner;

public class select_alpa 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String str =  input.nextLine();
		int num = input.nextInt();
		System.out.print(str.charAt(num - 1));
	}
}