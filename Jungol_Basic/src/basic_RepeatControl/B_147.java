/*
자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오. 
주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
3

1 2 3
  4 5
    6
 */
package basic_RepeatControl;

import java.util.Scanner;

public class B_147 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int output = 0;
		if(n>0) {
			for(int i=0; i<n; i++) {
				for(int k=0; k<i; k++) {
					System.out.printf("  ");
				}
				for(int j=i; j<n; j++) {
					output+=1;
					System.out.print(output+" ");
				}
				System.out.println();
			}
		}


	}
}
