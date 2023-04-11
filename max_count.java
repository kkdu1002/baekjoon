// https://www.acmicpc.net/problem/2562
package baekjoon;

import java.util.Scanner;

public class max_count
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int x = 9 , count = 1 , max = 0;
		int array [] = new int[x];
		
		for(int i = 0; i < x; i++) 
		{
			array[i] = input.nextInt();
			if(array[i] > max) 
			{
				max = array[i];
				count = i + count;
			}
		}
		System.out.println(max);
		System.out.println(count);
	}
}