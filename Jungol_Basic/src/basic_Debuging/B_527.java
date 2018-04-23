package basic_Debuging;

import java.util.Scanner;

public class B_527 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); // 첫번째 정수 입력 받기 위함
		int b = sc.nextInt(); // 두번째 정수 입력 받기 위함
		
		System.out.print(a/b+" ");
		System.out.printf("%.2f",(double)a/b); // 소수점 둘째자리 반올림을 위해 printf함수를 사용. .2 == 둘째자리 반올림을 뜻한다.
	}

}