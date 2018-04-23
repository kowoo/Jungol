
/*
자연수 n(n≤6)을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
주의! 문자는 공백으로 구분하되 줄사이에 빈줄은 없다.




3

A B C
D E 0
F 1 2
*/
package basic_RepeatControl;

import java.util.Scanner;

public class B_146 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int n = sc.nextInt();
		char a = 65;
		int b = 0; 
		if(n<=6) {
			for(int i=0; i<n; i++) {
				for(int j=i; j<n; j++) {
					System.out.printf(a+" ");
					a = (char)(a+1);
				}
				for(int k=0; k<i; k++) {
					System.out.printf(b+" ");
					b = b+1;
				}
				System.out.println();
			}
		}


	}
}
