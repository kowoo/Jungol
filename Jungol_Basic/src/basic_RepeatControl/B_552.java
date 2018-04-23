package basic_RepeatControl;

import java.util.Scanner;

public class B_552 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			
			
			
			
			
			
			
			for(int j=0; j<(n-i)*2-1; j++) { //조건식을 깔끔하게 할 수 있을지 생각해보자
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

/* n == 5 = 별 9개
 * n == 4 = 별 7개
 * n == 3 = 별 5개
 * n == 2 = 별 3개
 * n == 1 = 별 1개 라는 값이 나와야한다.
 * 그렇다면 n*2-1이 별의 개수라는것!
 */

