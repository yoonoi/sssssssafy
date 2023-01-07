package easy;

import java.util.Scanner;

public class 일대일가위바위보1936 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int win = 0;
		
		if(Math.abs(a-b) == 1) {
			win = Math.max(a, b);
		} else {
			win = Math.min(a, b);
		}
		
		char winner = win == a ? 'A' : 'B';
		System.out.println(winner);
	}
}
