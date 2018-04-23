
//10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오. 
//평균은 반올림하여 소수첫째자리까지 출력한다.
//
//
//
//
//95 100 88 65 76 89 58 93 77 99
//
//sum : 446
//avg : 78.8

//10개를 저장할 배열을 선언해야한다.
//입력받아서 저장해야하므로 스캐너. 10번이므로 반복문을 사용.
// 짝수번째 합계, 홀수번째 평균을 저장할 변수도 필요하다.
// 총 3개의 변수면 될듯? 
// 평균은 반올림이므로 printf로 출력.

package basic_Array;

import java.util.Scanner;

public class B_562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		double oddAvg=0;
		int evenSum=0;
		int point=0;
		for(int i=0; i<10; i++) {
			num[i] = sc.nextInt();
			
			if(i%2==1) {
				evenSum+=num[i];
			}
			if(i%2==0) {
				oddAvg+=num[i];
				point++;
			}
		}
		System.out.printf("sum : %d%n", evenSum);
		System.out.printf("avg : %.1f", oddAvg/point);
		
	}

}