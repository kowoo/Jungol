package basic_Debuging;

import java.util.Scanner;

public class B_526 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		int result1 = (int)(a*b); //a*b를 먼저 계산 후 정수 값으로 강제변환.
		int result2 = (int)a*(int)b; //a와 b를 각각 정수 값으로 강제 변환 후 곱하기 연산. 
		
		System.out.print(result1+" "); //프린트 함수의 공백을 표현하기 위해 " "를 추가.
		System.out.print(result2);
	}

}
