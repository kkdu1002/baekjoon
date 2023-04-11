// https://www.acmicpc.net/problem/11654
package baekjoon;

import java.util.Scanner;

public class change_ASCII 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String str =  input.nextLine();
		System.out.printf("%d",(int)str.charAt(0));
	}
}