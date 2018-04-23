/*
영문 대문자를 입력받다가 대문자 이외의 문자가 입력되면 입력을 중단하고
영문 대문자들에 대하여 1번 이상 입력된 각 문자와 그 문자의 개수를 사전 순으로 출력하는 프로그램을 작성하시오.
A B C F F F B Z !

A : 1
B : 2
C : 1
F : 3
Z : 1
*/
package basic_Array;

import java.util.Scanner;

public class B_564 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//A = 65, Z = 90
		int[] count= new int[26];
		
		while(true)	{
			char a = sc.next().charAt(0);
			if(a<'A'||a>'Z') {
				break;
			} else {
				count[a-65]++;
			}
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i]!=0) {
				System.out.printf("%c : %d%n", (char)('A'+i), count[i]);
			}
		}

	}
}
