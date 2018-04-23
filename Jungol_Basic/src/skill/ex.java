package skill;

public class ex {
	public static void main(String[] args) {
		int e=2;
		int s=5;
		
		for(int i=1; i<=9; i++) {
			System.out.println();
			for(int b=e;b<=s;b++) {
				System.out.printf("%d * %d = %d   ", b, i, b*i);
			}
		}
	}
}
