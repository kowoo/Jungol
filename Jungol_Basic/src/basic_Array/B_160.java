/*
승지는 주사위 놀이를 하다가 주사위를 10번 던져서 각 숫자가 몇 번씩 나왔는지 알아보려고 한다. 한번 던질 때마다 나온 주사위의 숫자를 입력받아서 각 숫자가 몇 번씩 나왔는지 출력하는 프로그램을 작성하시오.
5 6 3 4 5 5 2 2 4 6

1 : 0
2 : 2
3 : 1
4 : 2
5 : 3
6 : 2
*/
package basic_Array;

import java.util.Scanner;

public class B_160 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] dice = new int[6];
		
		for(int i=0; i<10; i++) {
			int num = input.nextInt();
			while(num<0||num>6) {
				num = input.nextInt();
			}
			dice[num-1]++;
		}
		
		for(int i=0; i<dice.length; i++) {
			System.out.printf("%d : %d%n", i+1, dice[i]);			
		}
	}
}