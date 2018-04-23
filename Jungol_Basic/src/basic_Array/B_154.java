/*
6명의 몸무게를 입력받아 몸무게의 평균을 출력하는 프로그램을 작성하시오. 
출력은 반올림하여 소수 첫째자리까지로 한다.

23.2 39.6 66.4 50.0 45.6 48.0

45.5
*/

package basic_Array;

import java.util.Scanner;

public class B_154 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] weights = new double[6];
		double sum=0;
		
		for(int i=0; i<weights.length; i++) {
			weights[i] = input.nextDouble();
			sum+=weights[i]; 
		}
		System.out.printf("%.1f",sum/weights.length);
		
		
	}

}