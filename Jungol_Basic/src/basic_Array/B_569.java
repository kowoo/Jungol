/*
5명 학생의 국어 영어 수학 과학 4과목의 점수를 입력 받아서 각 개인별로 평균이 80 이상이면“합격” 그렇지 않으면“불합격”을 출력하고 합격한 사람의 수를 출력하는 프로그램을 작성하시오.
85 67 95 65
80 95 86 56
100 98 67 86
95 76 84 65
67 86 90 76

fail
fail
pass
pass
fail
Successful : 2
*/
package basic_Array;

import java.util.Scanner;

public class B_569 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] students = new int[5][4];

		for(int i=0; i<students.length; i++) {
			for(int j=0; j<students[i].length; j++) {
				students[i][j] = sc.nextInt();
			}
		}
		
		int avg;
		int result=0;
		for(int i=0; i<students.length; i++) {
			avg=0;
			for(int j=0; j<students[i].length; j++) {
				avg+=students[i][j];
			}
			avg=avg/students[i].length;
			if(avg>=80) {
				System.out.println("pass");
				result++;
			} else {
				System.out.println("fail");
			}
		}
		System.out.println("Successful : "+result);
		
	}

}

