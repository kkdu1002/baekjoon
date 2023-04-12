// https://www.acmicpc.net/problem/11720

package baekjoon;

import java.util.Scanner;

public class sum_num 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int sum = 0 , N = input.nextInt();
		String num =  input.next();
		for(int i = 0; i < N ; i++)
		{
			sum += num.charAt(i) - 48;
		}
		System.out.print(sum);
	}
}