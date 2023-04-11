// https://www.acmicpc.net/problem/1546
package baekjoon;

import java.util.Scanner;

public class change_avg 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int max = 0 ;
		double avg = 0;
		int Score[] = new int[N];
		
		for(int i = 0; i < Score.length; i++)
		{
			Score[i] = input.nextInt();
			if(Score[i] > max) 
			{
				max = Score[i];
			}
		}
		for(int i = 0; i < Score.length; i++)
		{
			avg += (double)Score[i] / max * 100;
		}
		System.out.println(avg / N);
	}
}