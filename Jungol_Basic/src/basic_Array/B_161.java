/*
학생들의 점수를 입력을 받다가 0이 입력되면 그 때까지 입력받은 점수를 10점 단위로 구분하여 점수대별 학생 수를 출력하는 프로그램을 작성하시오. (1명도 없는 점수는 출력하지 않는다.)학생은 최대 100명이하이다.
63 80 95 100 46 64 88 0

100 : 1 person
90 : 1 person
80 : 2 person
60 : 2 person
40 : 1 person
*/
package basic_Array;

import java.util.Scanner;

public class B_161 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score=0;
		int[] scores = new int[11];
		
		for(int i=100; i>0; i--) {
			score = sc.nextInt();
			if(score==0) {
				break;
			}
			scores[score/10]++;
		}
		for(int i=scores.length-1; i>=0; i--) {
			if(scores[i]!=0) {
				System.out.printf("%d : %d person%n", (i*10), scores[i]);
			}
		}

	}
}