// https://www.acmicpc.net/problem/5597
package baekjoon;

import java.util.Scanner;

public class submit_homework 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int student[] = new int [30];
		int summit_hw_stu[] = new int [28];
		int i;
		
		for(i = 0; i < student.length; i++) 
		{
			student[i] = i + 1;
		}
		for(i = 0; i < summit_hw_stu.length; i++) 
		{
			summit_hw_stu[i] = input.nextInt();
		}
		for(i = 0; i < summit_hw_stu.length; i++) 
		{
			for(int j = 0; j < student.length; j++)
			{
				if(summit_hw_stu[i] == student[j])
				{
					summit_hw_stu[i] = 0;
					student[j] = 0;
				}
			}
		}
		for(i = 0; i < student.length; i++) 
		{
			if(student[i] != 0)
			{
				System.out.println(student[i]);
			}	
		}	
	}
}