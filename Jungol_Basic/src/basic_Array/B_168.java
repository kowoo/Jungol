/*
행의 크기를 입력받아 파스칼 삼각형을 작성하여 마지막 행부터 첫 번째 행까지 차례로 출력하는 프로그램을 작성하시오. 행의 크기는 최대 10이다.
6

1 5 10 10 5 1
1 4 6 4 1
1 3 3 1
1 2 1
1 1
1
*/
package basic_Array;

import java.util.Scanner;

public class B_168 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[][] nums = new int[input][input];
		
		//삼각형 만들기
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				if(j==0||j<nums.length-i)
				nums[i][j]=1;
			}
		}
		
		//파스칼 삼각형 만들기
		for(int i=nums.length-2; i>=0; i--) {
			for(int j=1; j<nums.length-i; j++) {
				nums[i][j]=nums[i+1][j-1]+nums[i+1][j];
			}
		}
		
		//출력
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				if(nums[i][j]!=0) {
					System.out.print(nums[i][j]+" ");
				}
			}
			System.out.println();
		}

	}
}