// https://www.acmicpc.net/problem/10818
package baekjoon;

import java.util.Scanner;

public class max_min 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int N , max = 0, min = 100000;
		N = input.nextInt();
		int  array[] = new int[N];
		for(int i = 0; i < N; i++) 
		{
			array[i] = input.nextInt();
			if(array[i] > max) 
			{
				max = array[i];
			}
			else if(array[i] < min)
			{
				min = array[i];
			}
		}
		System.out.printf("%d %d",min,max);
	}
}
