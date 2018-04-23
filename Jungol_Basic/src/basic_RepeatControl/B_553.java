//
//자연수 n을 입력받아 다음과 같이 영문자를 출력하는 프로그램을 작성하시오.
//
//
//
//
//3
//
//ABC
//DE
//F

//자연수를 입력받기 위한 정수 타입 변수 준비
//입력받은 자연수에 맞춰서 출력할 캐릭터 타입 변수 준비
//자연수인지 확인할 조건문 생성
//자연수일 경우 출력할 반복문 생성

package basic_RepeatControl;

import java.util.Scanner;

public class B_553 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char w = 'A'; // 'A' == 65
		
		if(n>0) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<n-i; j++) {
					System.out.print(w);
					w++;
					if(w>'z') {
						//만약 변수 w가 Z보다 크게되면 영문자가 출력되지 않는다. 
						//그렇기 때문에 w의 값을 A로 바꿔주는 것.
						w='A';
					}
				}
				System.out.println();
			}
		}	
		
	}

}
