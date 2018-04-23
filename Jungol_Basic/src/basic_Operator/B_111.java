
package basic_Operator;

import java.util.Scanner;

public class B_111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor = sc.nextInt();
		int math = sc.nextInt();
		int en = sc.nextInt();
		int com = sc.nextInt();
		int sum = kor+math+en+com;
		
		System.out.printf("sum %d%n", sum);
		System.out.printf("avg %d", sum/4);
	}

}

