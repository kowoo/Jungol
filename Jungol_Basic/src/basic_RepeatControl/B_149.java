/*
자연수 n을 입력받아 "출력 예"와 같이 n x n크기에 공백으로 구분하여 출력되는 프로그램을 작성하시오. 
10 미만의 홀수만 출력하시오.주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.

3

1 3 5
7 9 1
3 5 7
*/
package basic_RepeatControl;

import java.util.Scanner;

public class B_149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int odd = 1;
		if(n>0) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					System.out.print(odd+" ");
					odd+=2;
					if(odd>10) {
						odd-=10;
					}
				}
				System.out.println();
			}
			
		}
	
	}
}
