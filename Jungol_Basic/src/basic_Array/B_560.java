//10개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램을 작성하시오.(입력받을 정수는 1000을 넘지 않는다.)
//
//
//
//
//5 10 8 55 6 31 12 24 61 2
//
//2

package basic_Array;

import java.util.Scanner;

public class B_560 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int min=1000;
		
		for(int i=0; i<10; i++) {
			num[i] = sc.nextInt();
			if(num[i]<min) {
				min = num[i];
			}else if(num[i]>1000) {
				i--;
				break;
			}
		}
		System.out.println(min);
		
	}

}