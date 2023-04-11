// https://www.acmicpc.net/problem/10811
package baekjoon;

import java.util.Scanner;

public class change_box 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int N , M , i , j , stack;
		N = input.nextInt();
		M = input.nextInt();
		int box[] = new int [N];
		for(int k = 0 ; k < N ; k++)
		{
			box[k] = k + 1;
		}
		for(int k = 0 ; k < M ; k++)
		{
			i = input.nextInt();
			j = input.nextInt();
			stack = box[i - 1];
			box[i - 1] = box[j - 1];
			box[j - 1] = stack;
		}
		for(int k = 0 ; k < N; k++)
		{
			System.out.printf("%d ",box[k]);
		}
	}
}