/*
호석이네 학교는 6학년이 네 반이 있는데 각 반의 대표를 세 명씩 선발하여 제기차기 시합을 하였다.
반별로 세 명이 제기를 찬 개수를 입력받아 각 반별로 제기를 찬 개수의 합계를 출력하는 프로그램을 작성하시오.
(반드시 배열을 이용하고 입력후에 출력하는 방식으로 하세요.)
1class? 15 2 35
2class? 33 1 6
3class? 5 10 19
4class? 1 8 55

1class : 52
2class : 40
3class : 34
4class : 64
*/
package basic_Array;

import java.util.Scanner;

public class B_164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] ban = new int[4][3];
		int[] sum = new int[4];
		for(int i=0; i<ban.length; i++) {
			System.out.print((i+1)+"class? ");
			for(int j=0; j<ban[i].length; j++) {
				ban[i][j] = sc.nextInt();
				sum[i]+=ban[i][j];
			}
		}
		for(int i=0; i<sum.length; i++) {
			System.out.println((i+1)+"class : "+sum[i]);
		}
	}
}