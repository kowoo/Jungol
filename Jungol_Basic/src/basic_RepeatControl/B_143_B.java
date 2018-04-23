/*
자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.
주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.

3

*****
 ***
  *
 ***
*****

*/
package basic_RepeatControl;

import java.util.Scanner;

public class B_143_B {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int z=i; z<=(num*2)-i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=num-1; i++) {
			for(int j=num-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int z=1; z<=(i*2)+1; z++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
