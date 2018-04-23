/*
2행 4열의 배열 두 개를 만들어서 입력을 받고 두 배열의 곱을 구하여 출력하는 프로그램을 작성하시오.
first array
1 2 3 4
5 6 7 8
second array
1 4 7 8
3 6 9 8

1 8 21 32
15 36 63 64
*/
package basic_Array;

import java.util.Scanner;

public class B_568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] num1 = new int[2][4];
		int[][] num2 = new int[2][4];
		int i=0;
		int j=0;

		System.out.println("first array");
		for(i=0; i<6; i++) {
			for(j=0; i<2&&j<num1[0].length; j++) {
				num1[i][j] = sc.nextInt();
			}
			if(i==2) {
				System.out.println("second array");
			}
			for(j=0; (i<4 && i>1 && j<num1[0].length); j++) {
				num2[i-2][j] = sc.nextInt();	
			}
			for(j=0; i>3&&j<num1[1].length; j++) {
				System.out.print(num1[i-4][j]*num2[i-4][j]+" ");
			}
			if(i==4) {
				System.out.println();
			}
		}
		
	}

}

