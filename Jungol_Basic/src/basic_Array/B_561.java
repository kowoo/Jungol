//
//10개의 정수를 입력받아 100 미만의 수 중 가장 큰 수와 100 이상의 수 중 가장 작은 수를 출력하는 프로그램을 작성하시오.
//
//(입력되는 정수의 범위는 1이상 10,000 미만이다. 만약 해당하는 수가 없을 때에는 100 을 출력한다.)
//
//
//
//
//88 123 659 15 443 1 99 313 105 48
//
//99 105
//
//
//
//100 미만의 수로 입력 가능한 범위는 1~99, 100 이상의 수로 입력 가능한 범위는 100~9999 이다. 
//입력값보다 큰수(작은수)를 초기값으로 정하고 작업이 끝난 후 초기값이 그대로 있다면 해당하는 수가 없는 것이다.

package basic_Array;

import java.util.Scanner;

public class B_561 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int w = 10000;
		int l = 0;
		
		
		for(int i=0; i<10; i++) {
			num[i] = sc.nextInt();
			
			if(num[i]<100&&num[i]>l) { //100미만의 수 중에서 가장 큰 수
				l = num[i];
			}
			if(num[i]>=100&&num[i]<w) { //100이상의 수 중에서 가장 작은 수
				w = num[i];
			}
		}
		
		if(l==0) {
			l=100;
		}
		if(w==10000) {
			w=100;
		}
		
		System.out.printf("%d %d", l, w);
		
	}
	
}