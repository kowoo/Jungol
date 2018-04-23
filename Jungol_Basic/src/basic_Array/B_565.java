/*
100 미만의 양의 정수들이 주어진다. 입력받다가 0이 입력되면 마지막에 입력된 0 을 제외하고 그 때까지 입력된 정수의 십의 자리 숫자가 각각 몇 개인지 작은 수부터 출력하는 프로그램을 작성하시오. (0개인 숫자는 출력하지 않는다.)




10 55 3 63 85 61 85 0

0 : 1
1 : 1
5 : 1
6 : 2
8 : 2
*/
package basic_Array;

import java.util.Scanner;

public class B_565 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] counts = new int[10];
		
		while(true) {
			int a = sc.nextInt();
			if(a==0) {
				break;
			} else if(0<a&&a<100) {
				counts[a/10]++;
			} 
		}
		
		for (int i=0; i<counts.length; i++) {
			if(counts[i]!=0) {
				System.out.printf("%d : %d%n", i, counts[i]);
			}
		}
		
	}
}