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
//실수해서 다 날아감 다시 작성...
public class $B_142 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=i; k<(num*2)-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<num; i++) {
			for(int j=0; i>0 && j<(num-i-1); j++) {
				System.out.print(" ");
			}
			for(int j=0; i>0 && j<(i*2+1); j++) {
				System.out.print("*");
			}
			if(i>0) {
				System.out.println();
			}
		}

	}
}
