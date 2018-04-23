//
//10개의 정수를 입력받아 배열에 저장한 후 내림차순으로 정렬하여 출력하시오.
//
//
//
//
//95 100 88 65 76 89 58 93 77 99
//
//100 99 95 93 89 88 77 76 65 58

//1. 정수를 입력받기 위한 배열, 길이는 10.
//2. 총 10번 입력을 받아야하므로 반복문 (i<array.length)
//3. 내림차 순으로 정렬하여 출력해야 하므로 낮은 숫자부터 저장할 배열 추가.

package basic_Array;

import java.util.Scanner;

public class B_563 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];

		for(int i=0; i<10; i++) {
			nums[i] = sc.nextInt(); // 숫자 저장 완료.
		}
		
		int a=0;
		for(int i=0; i<10; i++) {			//숫자를 큰 순서로 정렬하기 위한 반복문이다.
			a = nums[i];						//임의의 a값에 배열의 i번째 수를 저장한다.
			for(int j=i+1; j<10; j++) {		//저장된 a값과 그 다음값의 대소를 비교하는 반복문이다.
				if(a<nums[j]) {
					a = nums[j];
					nums[j] = nums[i];	 
					nums[i] = a;
				}
			}
		}
		for(int num: nums) {
			System.out.print(num+" ");
		}

	}

}

