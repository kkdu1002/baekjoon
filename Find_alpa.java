// https://www.acmicpc.net/problem/10809
package baekjoon;

import java.util.Scanner;

public class Find_alpa 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String alpa = input.nextLine();
		int position[] = new int[26];
		
		// �迭 26�� -1�� �ʱ�ȭ
		for(int i = 0; i < position.length; i++ )
		{
			position[i] = -1;
		}

		for(int i = 0; i < alpa.length(); i++ )
		{
			if(position[alpa.charAt(i) - 'a'] != -1)
			{
				continue;
			}
			else //
				position[alpa.charAt(i) - 'a'] = i;
		}
		for(int j = 0; j < position.length; j++)
		{
			System.out.printf("%d ",position[j]);
		}
	}
}