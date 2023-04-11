// https://www.acmicpc.net/problem/10813
package baekjoon;

import java.util.Scanner;

public class change_ball 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int N , M;
		N = input.nextInt();
		M = input.nextInt();
		int array[] = new int [N];
		int i ,j , stack;
		
		for(int k = 0; k < N ; k++)
		{
			array[k] = k + 1;
		}
		
		for(int k = 0; k < M ; k++)
		{
			i = input.nextInt();
			j = input.nextInt();
			stack = array[i-1];
			array[i-1] = array[j-1];
			array[j-1] = stack;
		}
		
		for(int k = 0; k < N ; k++)
		{
			System.out.printf("%d ",array[k]);
		}
	}
}