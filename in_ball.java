// https://www.acmicpc.net/problem/10810
package baekjoon;

import java.util.Scanner;

public class in_ball 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int N , M;
		N = input.nextInt();
		M = input.nextInt();
		int array[] = new int [N];
		
		int i , j , k;
		for (int x = 0; x < M; x++)
		{
			i = input.nextInt();
			j = input.nextInt();
			k = input.nextInt();
			for(int b = i ; b <= j; b++) 
			{
				array[b - 1] = k;
			}
		}
		for (int x = 0; x < N; x++)
		{
			System.out.printf("%d ",array[x]);
		}
	}
}