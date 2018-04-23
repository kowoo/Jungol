/*
3행 5열의 2차원 문자배열을 선언하고 차례로 대문자를 입력 받은 후 소문자로 바꾸어서 공백으로 구분하여 출력하는 프로그램을 작성하시오.
A=65, a=97 32차이.
A B C D E
F G H I J
K L M N O

a b c d e
f g h i j
k l m n o
*/
package basic_Array;

import java.util.Scanner;

public class B_169 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] abc = new char[3][5];
		
		for(int i=0; i<abc.length; i++) {
			for(int j=0; j<abc[i].length; j++) {
				char alpha = sc.next().charAt(0);
				abc[i][j] = (char)(alpha+32);
			}
		}
		
		for(int i=0; i<abc.length; i++) {
			for(int j=0; j<abc[i].length; j++) {
				System.out.print(abc[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}