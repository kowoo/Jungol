/*
2행 3열 배열을 두 개 선언하여 각각의 값을 입력 받은 후 두 배열의 같은 위치끼리 곱하여 새로운 배열에 저장한 후 출력하는 프로그램을 작성하시오.
first array
3 6 9
8 5 2
second array
9 8 7
6 5 4

27 48 63
48 25 8
*/
package basic_Array;

import java.util.Scanner;

public class B_166 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] num1 = new int[2][3];
		int[][] num2 = new int[2][3];
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
				num2[i-4][j]=(num1[i-4][j]*num2[i-4][j]);
			}
		}
		
		for(i=0; i<num2.length; i++) {
			for(j=0; j<num2[i].length; j++) {
				System.out.print(num2[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}